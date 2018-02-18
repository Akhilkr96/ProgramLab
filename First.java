package com.batch;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class First {

	public static void main(String args[]){
		
		//springConfigurer springConfigurer=new springConfigurer();
		System.out.println("--------------"+System.getProperty("java.class.path")+"....................");
		AbstractApplicationContext  context = new AnnotationConfigApplicationContext(springConfigurer.class);
		System.out.println("hahahagh-------------------------");
	}
}
