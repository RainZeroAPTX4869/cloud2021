package com.rain.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/16
 */
@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan("com.rain.springcloud.dao")
@SpringBootApplication
public class PaymentMain8010 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8010.class, args);
    }
}
