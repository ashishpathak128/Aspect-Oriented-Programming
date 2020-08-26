package org.ashish.pack;

import org.ashish.pack.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService ss = context.getBean("shapeService", ShapeService.class);
		System.out.println(ss.getCircle());
	
	}

}
