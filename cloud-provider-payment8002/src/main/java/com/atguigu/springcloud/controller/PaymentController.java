package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Author: fengzai
 * @Date: 2020/12/7 15:49 （日期和时间）
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    String severPort;

    @PostMapping("/payment/create")
    public CommonResult cerate (@RequestBody Payment payment){
        int result=paymentService.create( payment);
        if(result>0){
            return  new CommonResult(200,"插入数据成功 severPort: "+severPort,result);
        }else{
            return  new CommonResult(444,"插入数据失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById (@PathVariable("id") Long id){
        Payment payment=paymentService.getPaymentById(id);
        if(payment!=null){
            return  new CommonResult(200,"查询成功 severPort: "+severPort,payment);
        }else{
            return  new CommonResult(444,"没有对应记录，查询id："+id,null);
        }
    }
}
