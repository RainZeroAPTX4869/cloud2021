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
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain9200 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceMain9200.class, args);
    }
}
