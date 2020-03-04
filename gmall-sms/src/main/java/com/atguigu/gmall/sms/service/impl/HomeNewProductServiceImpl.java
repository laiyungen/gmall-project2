package com.atguigu.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.sms.entity.HomeNewProduct;
import com.atguigu.gmall.sms.mapper.HomeNewProductMapper;
import com.atguigu.gmall.sms.service.HomeNewProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 新鲜好物表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductMapper, HomeNewProduct> implements HomeNewProductService {

}
