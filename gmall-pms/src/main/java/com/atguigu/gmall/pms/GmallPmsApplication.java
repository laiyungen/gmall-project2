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
 *
 * 引入一个场景，猜这个场景的 xxxAutoConfiguration,它帮我们
 * 注入了能操作这个技术的组件，这个场景的配置信息都在
 * xxxProperties 中说明了 (prefix="spring.redis") 使用哪种前缀配置
 *
 * 整合 Redis 的两大步骤：
 *  1、导入 starter-data-redis 场景依赖
 *  2、application.properties 配置与 spring.redis 相关的属性
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
