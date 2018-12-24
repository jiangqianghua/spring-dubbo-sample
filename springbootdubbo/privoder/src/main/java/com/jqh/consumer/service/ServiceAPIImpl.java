package com.jqh.consumer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jqh.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
@Service(interfaceClass = ServiceAPI.class)
public class ServiceAPIImpl implements ServiceAPI {
    @Override
    public String sendMessage(String message) {
        return "privoder message 111" +message ;
    }
}
