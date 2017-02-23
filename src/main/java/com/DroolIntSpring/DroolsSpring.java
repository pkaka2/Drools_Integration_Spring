package com.DroolIntSpring;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 
 * @author Pradeep Chandra
 *
 */

public class DroolsSpring {

    public static void main(String args[]){
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ((ProductService)applicationContext.getBean("ProductServiceImpl")).runProductLogic();
        

    }
}