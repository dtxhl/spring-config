package com.xhl.ch1.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("�ң�bean-demoListener�����յ���bean-demoPublisher��������Ϣ��"+msg);
	}

}
