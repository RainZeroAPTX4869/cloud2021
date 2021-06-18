package com.rain.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/16
 */
@EnableEurekaClient
@MapperScan("com.rain.springcloud.dao")
@SpringBootApplication
public class PaymentMain8012 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8012.class, args);
    }
}
