package com.example.springevent.listener;

import com.example.springevent.event.OrderEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OrderHandler {

    @EventListener
    public void sendNotifacation(OrderEvent event) {
        System.out.println("order number: "+event.getOrder().getOrderNum()+" is paid");
    }
}
