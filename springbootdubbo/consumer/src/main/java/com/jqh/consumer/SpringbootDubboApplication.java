package com.jqh.consumer;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.jqh.consumer.service.ServiceConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDubboApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =  SpringApplication.run(SpringbootDubboApplication.class, args);
		ServiceConsumer serviceConsumer = (ServiceConsumer)run.getBean("serviceConsumer") ; //默认类名第一个小写
		serviceConsumer.sendMessage("dubbo hello");
	}
}
