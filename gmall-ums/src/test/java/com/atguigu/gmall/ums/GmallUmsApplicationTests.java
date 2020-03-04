package com.atguigu.gmall.ums;

import com.atguigu.gmall.ums.entity.Admin;
import com.atguigu.gmall.ums.service.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallUmsApplicationTests {

    @Autowired
    AdminService adminService;

    @Test
    void contextLoads() {
        Admin admin = adminService.getById(1);
        System.out.println(admin.getUsername());
    }

}
