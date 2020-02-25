package com.dipsscor.api;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/API")
public class ApiController {
	
	
	@Value("${test.key:local-Hello}")
	String value;
	
	
	
    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String hello() {
        return value + " This is a Test API";
    }
	
	

}
