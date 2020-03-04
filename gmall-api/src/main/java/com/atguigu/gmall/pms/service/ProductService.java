package com.atguigu.gmall.pms.service;

import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.vo.PageInfoVo;
import com.atguigu.gmall.vo.product.PmsProductParam;
import com.atguigu.gmall.vo.product.PmsProductQueryParam;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
public interface ProductService extends IService<Product> {

    void saveProduct(PmsProductParam productParam);

    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}
