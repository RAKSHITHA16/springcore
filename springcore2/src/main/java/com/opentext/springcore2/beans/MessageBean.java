package com.opentext.springcore2.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Hello world!
 *
 */
public class MessageBean implements InitializingBean,DisposableBean
{
   private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public void destroy() throws Exception {
System.out.println("destruction...");	
}

@Override
public void afterPropertiesSet() throws Exception {
System.out.println("initialsing...");	
}
//   
//public void init() {
//	System.out.println("intialisation..");
//}
//
//public void destroy() {
//	System.out.println("destruction..");
//}
}
