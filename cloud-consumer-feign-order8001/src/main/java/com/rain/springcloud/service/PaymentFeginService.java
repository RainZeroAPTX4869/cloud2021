package com.rain.springcloud.service;

import com.rain.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author RainZero
 * @date 2021/6/17
 */
@Component
@FeignClient(value = "cloud-provider-payment")
public interface PaymentFeginService {

    @GetMapping("/payment/get/{id}")
    CommonResult selectOne(@PathVariable("id") Long id);
}
