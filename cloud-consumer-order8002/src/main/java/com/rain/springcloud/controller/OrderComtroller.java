package com.rain.springcloud.controller;

import com.rain.springcloud.entity.CommonResult;
import com.rain.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/16
 */
@RestController
@RequestMapping("/consumer")
@Slf4j
public class OrderComtroller {

    public static final String PAYMENT_URL = "http://CLOUD-PROVIDER-PAYMENT";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }


    @PostMapping("/payment/insert")
    public CommonResult insert(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, CommonResult.class);
    }
}
