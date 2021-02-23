package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: fengzai
 * @Date: 2021/1/20 15:21
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")  //指定调用哪个微服务
public interface PaymentFeignService {

    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById (@PathVariable("id") Long id);

    @GetMapping("/payment/feign/timeout")
    public String  paymentFeignTimeout();
}
