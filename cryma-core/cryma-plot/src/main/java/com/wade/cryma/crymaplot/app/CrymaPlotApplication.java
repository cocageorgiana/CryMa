package com.wade.cryma.crymaplot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@EnableEurekaClient
@EnableScheduling
@EnableJpaRepositories(basePackages = "com.wade.cryma.crymaplot.repository")
@EntityScan(basePackages = "com.wade.cryma.crymaplot.model")
@ComponentScan("com.wade.cryma.crymaplot.*")
@Configuration
public class CrymaPlotApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrymaPlotApplication.class, args);
	}
}
