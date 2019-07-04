package com.opentext.autowiring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.autowiring.beans.TextEditor;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	TextEditor textEditor=(TextEditor)context.getBean("texteditor");
    	
    System.out.println(textEditor.getName());
    textEditor.getSpellchecker().methSpellchecker();
    }
}
