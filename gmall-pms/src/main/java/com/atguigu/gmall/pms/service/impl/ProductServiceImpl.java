package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.mapper.ProductMapper;
import com.atguigu.gmall.pms.service.ProductService;
import com.atguigu.gmall.vo.PageInfoVo;
import com.atguigu.gmall.vo.product.PmsProductParam;
import com.atguigu.gmall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public void saveProduct(PmsProductParam productParam) {

    }

    /**
     * @API
     * @Author lyg
     * @Description 根据复杂查询条件返回产品分页数据
     * @Date 2020/3/4 15:34
     * @Param [productQueryParam]
     * @return com.atguigu.gmall.vo.PageInfoVo
     **/
    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam) {
        // 封装查询条件
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        if (productQueryParam.getBrandId() != null){
            queryWrapper.eq("brand_id",productQueryParam.getBrandId());
        }
        if (!StringUtils.isEmpty(productQueryParam.getKeyword())){
            queryWrapper.like("name",productQueryParam.getKeyword());
        }
        if (productQueryParam.getProductCategoryId() != null){
            queryWrapper.eq("product_category_id",productQueryParam.getProductCategoryId());
        }
        if (!StringUtils.isEmpty(productQueryParam.getProductSn())){
            queryWrapper.like("product_sn",productQueryParam.getProductSn());
        }
        if (productQueryParam.getPublishStatus() != null){
            queryWrapper.eq("publish_status",productQueryParam.getPublishStatus());
        }
        if (productQueryParam.getVerifyStatus() != null){
            queryWrapper.eq("verify_status",productQueryParam.getVerifyStatus());
        }
        IPage<Product> productIPage = productMapper.selectPage(new Page<>(productQueryParam.getPageNum(), productQueryParam.getPageSize()), queryWrapper);
        PageInfoVo pageInfoVo = new PageInfoVo(productIPage.getTotal(),productIPage.getPages(),productIPage.getPages(),productIPage.getRecords(),productIPage.getCurrent());
        return pageInfoVo;
    }
}
