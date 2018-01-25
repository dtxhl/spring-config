package com.xhl.ch1.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

public class ProfileConfig {
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile");
	}
	@Bean
	@Profile("prod")
	public DemoBean proDemoBean() {
		return new DemoBean("from production profile");
	}
}
