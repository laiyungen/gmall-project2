package com.atguigu.gmall.oms;

import com.atguigu.gmall.oms.entity.CartItem;
import com.atguigu.gmall.oms.service.CartItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallOmsApplicationTests {

    @Autowired
    CartItemService cartItemService;

    @Test
    void contextLoads() {
        CartItem cartItem = cartItemService.getById(12);
        System.out.println(cartItem.getProductName()+"===================");
    }

}
