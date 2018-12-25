package com.jqh.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jqh.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class ServiceConsumer {
//    @Reference(url = "dubbo://127.0.0.1:20880")
    @Reference(interfaceClass = ServiceAPI.class)
    ServiceAPI serviceAPI ;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }
}
