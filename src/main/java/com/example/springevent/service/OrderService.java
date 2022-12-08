package com.example.springevent.service;

import com.example.springevent.Order;
import com.example.springevent.event.OrderEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void orderReplaced() {
        Order order = Order.builder().orderNum("1234").price(250.5).build();
        eventPublisher.publishEvent(new OrderEvent("paid",order));
    }
}
