package com.dipsscor.api;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;


@Controller("/API")
public class CustomerMgmtAPI {
	
	@Get(value = "/healthcheck")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
		
		return "This is a Customer Management Service";
		
	}


}
