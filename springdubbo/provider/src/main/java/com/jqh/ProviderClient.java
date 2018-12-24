package com.jqh;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
        context.start();

        try {
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
