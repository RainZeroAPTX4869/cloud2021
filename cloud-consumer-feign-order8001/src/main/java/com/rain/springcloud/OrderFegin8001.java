package com.rain.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/17
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFegin8001 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFegin8001.class, args);
    }
}
