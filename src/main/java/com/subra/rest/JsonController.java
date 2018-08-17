package com.subra.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class JsonController {

	private static final Logger logger = LoggerFactory.getLogger(JsonController.class);
	
/*	@ResponseBody
	@RequestMapping(value= "/{id}", method=RequestMethod.POST, produces={"application/json"})
	public User updateCustomer(@PathVariable("id") String identity ){
		logger.info("Inside {} and id = {}", "updateCustomer( )", identity);
		return new User(identity, "David Spale");
		
	}
*/
	/* sample curl curl -X POST -H "Content-Type: application/json" -d '{ "user": "abc21", "name": "Justin" }' "http://localhost:8086/api/mcf8uy75" */
	@ResponseBody
	@RequestMapping(value= "/{id}", method=RequestMethod.POST, produces={"application/json"})
	public User updateCustomer(@PathVariable("id") String identity, @RequestBody User u1 ){
		logger.info("Inside {} and id = {}", "updateCustomer( )", identity);
		logger.info("Inside {}  data u1={}", "updateCustomer( )", u1.toString());
		return new User(identity, "David Spale");
		
	}	
	
	
}
