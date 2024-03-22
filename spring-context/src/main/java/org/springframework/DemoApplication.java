package org.springframework;

import org.springframework.bean.AClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @ComponentScan(basePackages = {"org.springframework.bean"})
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// ApplicationContext context = new AnnotationConfigApplicationContext(DemoApplication.class);

		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println(context.getBean(beanName));
		}

		AClass aClass = (AClass) context.getBean("aClass");
		aClass.print();

	}
}
