package com.opentext.springcore2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.springcore2.beans.MessageBean;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		MessageBean messageBean=(MessageBean)context.getBean("messagebean");
		
		System.out.println(messageBean.getMessage());
		((AbstractApplicationContext)context).close();
		
		
	}

}
