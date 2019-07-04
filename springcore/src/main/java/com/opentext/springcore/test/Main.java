package com.opentext.springcore.test;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opentext.springcore.beans.StudentBean;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println("enter the no of students");
		int n = scanner.nextInt();

		StudentBean sb[] = new StudentBean[n];

		for (int i = 0; i <n; i++) {
			StudentBean studbean = (StudentBean) context.getBean("studentbean");
			System.out.println("enter the student " + i + " name");
			String name = scanner.next();

			System.out.println("enter the student " + i + " rollno");
			String rollno = scanner.next();

			System.out.println("enter the student " + i + " mobileno");
			long mobileno = scanner.nextLong();

			System.out.println("enter the student " + i + " emailid");
			String emailid = scanner.next();

			System.out.println("enter the student " + i + " gender");
			String gender = scanner.next();
			System.out.println("*************************");

			studbean.setName(name);
			studbean.setRollno(rollno);
			studbean.setMobileno(mobileno);
			studbean.setEmailid(emailid);
			studbean.setGender(gender);
			sb[i] = studbean;
		}

		for (int i = 0; i <n; i++) {

			System.out.println("student " + i + " details");
			System.out.println("name" + i + " " + sb[i].getName());
			System.out.println("rollno" + i + " " + sb[i].getRollno());

			System.out.println("mobileno" + i + " " + sb[i].getMobileno());

			System.out.println("emailid" + i + " " + sb[i].getEmailid());

			System.out.println("gender" + i + " " + sb[i].getGender());
			System.out.println("*******************************");

		}

	}
}
