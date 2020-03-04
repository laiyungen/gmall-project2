package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.mapper.ProductMapper;
import com.atguigu.gmall.pms.service.ProductService;
import com.atguigu.gmall.vo.PageInfoVo;
import com.atguigu.gmall.vo.product.PmsProductParam;
import com.atguigu.gmall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

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
        return null;
    }
}
