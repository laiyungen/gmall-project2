package com.atguigu.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.sms.entity.HomeRecommendSubject;
import com.atguigu.gmall.sms.mapper.HomeRecommendSubjectMapper;
import com.atguigu.gmall.sms.service.HomeRecommendSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 首页推荐专题表 服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectMapper, HomeRecommendSubject> implements HomeRecommendSubjectService {

}
