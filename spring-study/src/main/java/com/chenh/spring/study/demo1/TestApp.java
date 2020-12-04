package com.chenh.spring.study.demo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.chenh.spring.study.demo1");
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		Arrays.asList(beanDefinitionNames).forEach(System.out::println);

	}
}
