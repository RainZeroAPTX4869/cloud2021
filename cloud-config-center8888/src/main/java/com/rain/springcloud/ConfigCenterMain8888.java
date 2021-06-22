package com.rain.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created with IntelliJ IDEA.
 * curl -X POST "http://localhost:8888/actuator/bus-refresh"
 *
 * @author RainZero
 * @date 2021/6/20
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterMain8888 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain8888.class, args);
    }
}
