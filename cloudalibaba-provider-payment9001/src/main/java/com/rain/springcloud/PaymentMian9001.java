package com.rain.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/21
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMian9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMian9001.class, args);
    }
}
