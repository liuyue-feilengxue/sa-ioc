package cn.edu.scau.sec.tangxuexi.client;

import org.springframework.context.ApplicationContext;

import cn.edu.scau.sec.tangxuexi.spring.bean.*;
import cn.edu.scau.sec.tangxuexi.spring.util.ApplicationContextUtil;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ac = ApplicationContextUtil.getApplicationContext();
		Student tangxuexi=(Student) ac.getBean("tangxuexi");
		System.out.println(tangxuexi.getName()+"�ı�ҵ���ָ����ʦ�ǣ�"+tangxuexi.getTutor().getName());
	}
}
