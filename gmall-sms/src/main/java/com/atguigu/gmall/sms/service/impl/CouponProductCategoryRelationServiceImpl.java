package com.atguigu.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.sms.entity.CouponProductCategoryRelation;
import com.atguigu.gmall.sms.mapper.CouponProductCategoryRelationMapper;
import com.atguigu.gmall.sms.service.CouponProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 优惠券和产品分类关系表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationMapper, CouponProductCategoryRelation> implements CouponProductCategoryRelationService {

}
