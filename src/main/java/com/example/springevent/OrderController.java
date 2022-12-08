package com.example.springevent;

import com.example.springevent.event.OrderEvent;
import com.example.springevent.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/")
    public String pay() {
        orderService.orderReplaced();
        return "success";
    }
}
