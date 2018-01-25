package com.xhl.ch1.prepost;

import javax.annotation.PreDestroy;

public class JSR250WayService {
	public void init() {
		System.out.println("jsr250-init-method");
	}

	public JSR250WayService() {
		super();
		System.out.println("��ʼ�����캯��-JSR250WayService");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("jsr250-destory-method");
	}
}
