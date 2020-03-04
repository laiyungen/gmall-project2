package com.atguigu.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.gmall.pms.entity.ProductOperateLog;
import com.atguigu.gmall.pms.mapper.ProductOperateLogMapper;
import com.atguigu.gmall.pms.service.ProductOperateLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lyg
 * @since 2020-03-03
 */
@Service
@Component
public class ProductOperateLogServiceImpl extends ServiceImpl<ProductOperateLogMapper, ProductOperateLog> implements ProductOperateLogService {

}
