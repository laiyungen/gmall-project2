package com.atguigu.gmall.pms;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @API
 * @Author lyg
 * @Description
 * 1、配置整合 dubbo
 * 2、配置整合 mybatisplus
 * logstash 整合
 *  1、导入相关依赖 jar
 *  2、导入 logback 的日志配置文件
 *  3、在 kibana 里面建立好日志索引，就可以可视化检索
 * @Date 2020/3/3 16:22
 * @Param 
 * @return 
 **/
@EnableDubbo
@MapperScan(basePackages = "com.atguigu.gmall.pms.mapper")
@SpringBootApplication
public class GmallPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallPmsApplication.class, args);
    }

}
