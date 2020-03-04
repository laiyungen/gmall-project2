package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
//        Product product = productService.getById(1);
//        System.out.println(product.getName());
        // 测试增删改在主库、查在从库
//        Brand brand = new Brand();
//        brand.setName("测试增删改在主库");
//        boolean saveStatus = brandService.save(brand);
//        if (saveStatus){
//            System.out.println("保存成功。。。");
//        }
        Brand brand = brandService.getById(50);
        System.out.println(brand.getName());
    }

}
