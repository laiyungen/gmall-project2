package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.constant.SysCacheConstant;
import com.atguigu.gmall.pms.entity.ProductCategory;
import com.atguigu.gmall.pms.mapper.ProductCategoryMapper;
import com.atguigu.gmall.pms.service.ProductCategoryService;
import com.atguigu.gmall.vo.product.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Slf4j
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    /**
     * @API
     * @Author lyg
     * @Description 商品分类：查询所有一级分类及子分类,查询任意菜单以及他下面的所有子菜单
     * @Date 2020/3/5 15:36
     * @Param [i]
     * @return java.util.List<com.atguigu.gmall.vo.product.PmsProductCategoryWithChildrenItem>
     **/
    @Override
    public List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Long id) {
        List<PmsProductCategoryWithChildrenItem> pmsProductCategoryWithChildrenItemList = null;
        Object cacheMenu = redisTemplate.opsForValue().get(SysCacheConstant.CATEGORY_MENU_CACHE_KEY);
        if (cacheMenu != null){
            log.debug("菜单(商品分类)命中缓存。。。");
            pmsProductCategoryWithChildrenItemList = (List<PmsProductCategoryWithChildrenItem>)cacheMenu;
        }else {
            pmsProductCategoryWithChildrenItemList = productCategoryMapper.listCatelogWithChilder(id);
            redisTemplate.opsForValue().set(SysCacheConstant.CATEGORY_MENU_CACHE_KEY,pmsProductCategoryWithChildrenItemList);
        }
        return pmsProductCategoryWithChildrenItemList;
    }
}
