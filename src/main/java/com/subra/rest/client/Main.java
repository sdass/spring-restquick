package com.subra.rest.client;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.subra.rest.RestServer;
import com.subra.rest.User;

@PropertySource("classpath:application.properties")
public class Main {
	
	private static final Logger log =  LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args){
		log.info("in main() . . .");
		ApplicationContext context = new AnnotationConfigApplicationContext(RestConfig.class);
		RestServer myRestServer = context.getBean(RestServer.class);
		/* prepare data to send
		Map<String, String> vars = new HashMap<String, String>();
		vars.put("id", "INDIC");
		*/
		try {
			//rest attempts
			RestTemplate restTemplate = new RestTemplate();
			//no authentication logic yet
			User reqObj = new User();
			reqObj.setName("Loft"); reqObj.setUser("DSD");
			//String url = "http://localhost:8086/api/mcf8uy75";
			String url = "http://localhost:8086/api/INDIC"; //path variable  a/b/
			User retObj = restTemplate.postForObject(url, reqObj, User.class);
			//User retObj = restTemplate.postForObject(url, reqObj, User.class, vars);//uri variables ?id=INDIC 
			log.info("returned user=" + retObj.toString());
			
		} catch(HttpClientErrorException e){
			log.error("error: " + e.getResponseBodyAsString());
			//ObjectM
			e.printStackTrace();
		} catch (Exception e) {
			
			log.error("error: " + e.getMessage());
		}
		
	}

}
