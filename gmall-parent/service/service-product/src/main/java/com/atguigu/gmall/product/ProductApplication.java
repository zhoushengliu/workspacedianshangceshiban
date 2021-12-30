package com.atguigu.gmall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 琉
 * @create 2021-12-16 22:49
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.atguigu.gmall.product.mapper")
@ComponentScan("com.atguigu.gmall")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);

    }
}
