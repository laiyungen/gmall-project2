package com.atguigu.gmall.ums.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @API
 * @ClassName PmsDataSourceConfig
 * @Description TODO 这是一个自定义添加数据源的配置类
 * @Author lyg
 * @Date 2020/3/3 14:40
 * @Version 1.0
 **/
@Configuration
public class UmsDataSourceConfig {

    @Bean
    public DataSource dataSource() throws IOException, SQLException {
        // 通过 spring 提供的 ResourceUtils 工具类获取一个 file 对象
        File file = ResourceUtils.getFile("classpath:sharding-jdbc.yml");
        DataSource dataSource = MasterSlaveDataSourceFactory.createDataSource(file);
        return dataSource;
    }

}
