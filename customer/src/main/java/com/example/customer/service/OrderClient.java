package com.example.customer.service;

import com.example.customer.dto.post.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

// 创建 OpenFeign 与服务提供者的调用接口
@Service
@FeignClient(name = "order-service")
public interface OrderClient {
    @PostMapping("/order/create")
    public String createOrder(Order order);
}
