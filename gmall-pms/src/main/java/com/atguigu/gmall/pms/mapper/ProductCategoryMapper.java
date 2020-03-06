package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.ProductCategory;
import com.atguigu.gmall.vo.product.PmsProductCategoryWithChildrenItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {

    // 商品分类：查询所有一级分类及子分类,查询任意菜单以及他下面的所有子菜单
    List<PmsProductCategoryWithChildrenItem> listCatelogWithChilder(Long id);
}
