package com.subra.rest.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.subra.rest.RestServer;

@Configuration
//@Enabletransaction
@ComponentScan(basePackageClasses={Main.class})
@PropertySource("classpath:application.properties")
public class RestConfig {

	private static final Logger log =  LoggerFactory.getLogger(RestConfig.class);
	
	@Bean
	public RestServer restserver(Environment env){
		RestServer restServer = new RestServer(env.getProperty("rest.user"), env.getProperty("rest.password"), env.getProperty("rest.host"));
		log.info(restServer.getHost() + " " + restServer.getUser());
		return restServer;
	
	}
}
