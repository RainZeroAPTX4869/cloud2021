package com.rain.springcloud.controller;

import com.rain.springcloud.entity.CommonResult;
import com.rain.springcloud.service.PaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/17
 */
@RestController
@Slf4j
@RequestMapping("/consumer")
public class OrderFeginController {
    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping("/payment/get/{id}")
    public CommonResult selectOne(@PathVariable("id") Long id) {

        return paymentFeginService.selectOne(id);
    }
}
