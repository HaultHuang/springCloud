package org.provider.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages="org.provider")
public class ProviderApplication {

	
	public static void main(String[] args) {
		new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
	}
}
