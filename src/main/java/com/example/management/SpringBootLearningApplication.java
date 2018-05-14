package com.example.management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.management.dao")
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApplication.class, args);
	}

//	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(SpringBootLearningApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
//	}
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		// 注意这里要指向原先用main方法执行的Application启动类
//		return builder.sources(SpringBootLearningApplication.class);
//	}
}
