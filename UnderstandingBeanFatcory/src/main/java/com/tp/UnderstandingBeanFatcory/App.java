package com.tp.UnderstandingBeanFatcory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );    	
    	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
    	
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	Alien obj = (Alien)factory.getBean("alien");    	
    	obj.setValue(100);
    	System.out.println(obj.getValue());;
    	
    	
    	Alien obj2 = (Alien)factory.getBean("alien");    	
    	obj2.setValue(140);
    	System.out.println(obj2.getValue());;
    	obj.code();
    	
    }
}
