package com.rain.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/20
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    String getConfigInfo() {
        return "serverPort:" + serverPort + "\t configInfo:" + configInfo;
    }
}
