package com.rain.springcloud.controller;

import com.rain.springcloud.entity.CommonResult;
import com.rain.springcloud.entity.Payment;
import com.rain.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Payment)表控制层
 *
 * @author makejava
 * @since 2021-06-16 11:40:03
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {
    /**
     * 服务对象
     */
    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/get/{id}")
    public CommonResult selectOne(@PathVariable("id") Long id) {
        return this.paymentService.queryById(id);
    }

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        return this.paymentService.insert(payment);
    }

    @GetMapping("/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println("service:" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {
            System.out.println("instance:" + instance.getHost()+" "+instance.getPort());
        }
        return this.discoveryClient;
    }

}