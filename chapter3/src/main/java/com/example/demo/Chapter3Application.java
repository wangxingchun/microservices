package com.example.demo;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching //
public class Chapter3Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter3Application.class, args);
	}
	
	/**
	 * 创建消息队列对象
	 */
	@Bean
    public Queue queue() {
       return new ActiveMQQueue("active.queue");
    }

}
