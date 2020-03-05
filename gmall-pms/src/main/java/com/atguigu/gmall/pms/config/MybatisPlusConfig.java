package com.atguigu.gmall.pms.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @API
 * @ClassName MybatisPlusConfig
 * @Description TODO
 * @Author lyg
 * @Date 2020/3/4 16:27
 * @Version 1.0
 **/
//Spring boot方式
@EnableTransactionManagement
@Configuration
@MapperScan("com.baomidou.cloud.service.*.mapper*")
public class MybatisPlusConfig {

    /**
     * @API
     * @Author lyg
     * @Description 给 Spring 容器中注入 MybatisPlus 的分页插件对象
     * @Date 2020/3/4 16:30
     * @Param []
     * @return com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor
     **/
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}

