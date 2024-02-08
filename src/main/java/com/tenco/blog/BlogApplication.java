package com.tenco.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tenco.blog.repository.interfaces.BoardRepository"})
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}

//Consider defining a bean of type 'com.tenco.blog.repository.interfaces.BoardRepository' in your configuration. 오류