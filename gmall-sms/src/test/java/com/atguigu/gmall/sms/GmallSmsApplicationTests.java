package com.atguigu.gmall.sms;

import com.atguigu.gmall.sms.entity.Coupon;
import com.atguigu.gmall.sms.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallSmsApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {
        Coupon coupon = couponService.getById(2);
        System.out.println(coupon.getAmount());
    }

}
