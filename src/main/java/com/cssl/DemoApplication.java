package com.cssl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 实现接口的方式启动SpringBoot
 */
@ServletComponentScan("com.cssl.listener")
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

	//主方法启动springboot
	public static void main(String[] args) throws Exception {

		SpringApplication.run(DemoApplication.class,args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}
}
