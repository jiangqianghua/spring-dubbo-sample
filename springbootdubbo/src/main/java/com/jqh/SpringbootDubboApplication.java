package com.jqh;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

@Component
@EnableDubboConfiguration
public class SpringbootDubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboApplication.class, args);
	}
}
