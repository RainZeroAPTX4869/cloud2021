package com.rain.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/19
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GatewayMain8100 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain8100.class, args);
    }
}
