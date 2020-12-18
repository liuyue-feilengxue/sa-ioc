package cn.edu.scau.sec.tangxuexi.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextUtil { //µ¥Àý
	static ApplicationContext applicationContext;
	public static ApplicationContext getApplicationContext() {
		if(applicationContext==null) {
			applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		}
		return applicationContext;
		
	}

}
