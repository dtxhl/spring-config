package com.xhl.ch1.prepost;

public class BeanWayService {
	public void init() {
	   System.out.println("@Bean-init-method");
	}

	public BeanWayService() {
		super();
		System.out.println("��ʼ�����캯��-beanWayService");
	}
	
	public void destroy() {
		System.out.println("@Bean-destory-method");
	}
}
