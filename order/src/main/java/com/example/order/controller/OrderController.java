package com.example.order.controller;

import com.example.order.dto.request.Order;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("")
    public String getHello() {
        return "hello from order service.";
    }

    private static Map<String, String> orders = new HashMap<>();

    @PostMapping("/create")
    public String createOrder(@RequestBody Order order) {
        orders.put(order.getOrderId(), order.getOrderName());
        return "success" + order.toString();
    }
}
