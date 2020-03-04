package com.atguigu.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.sms.entity.HomeBrand;
import com.atguigu.gmall.sms.mapper.HomeBrandMapper;
import com.atguigu.gmall.sms.service.HomeBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 首页推荐品牌表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class HomeBrandServiceImpl extends ServiceImpl<HomeBrandMapper, HomeBrand> implements HomeBrandService {

}
