package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

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

    @Test
    void stringRedisTemplate(){
        stringRedisTemplate.opsForValue().set("hello","redis");
        System.out.println("往 redis 存入数据完成。。。");
        String str = stringRedisTemplate.opsForValue().get("hello");
        System.out.println(str);
    }

    @Test
    void redisTemplate(){
        Brand brand = new Brand();
        brand.setName("测试redis存对象(json)");
        redisTemplate.opsForValue().set("jsonbran",brand);
        System.out.println("向redis中存入一个对象");
        Object bran = redisTemplate.opsForValue().get("jsonbran");
        System.out.println("从缓存中获取的数据为：" + bran);
    }

}
