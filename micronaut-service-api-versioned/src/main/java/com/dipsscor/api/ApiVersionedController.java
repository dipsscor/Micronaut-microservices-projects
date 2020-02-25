package com.dipsscor.api;

import io.micronaut.core.version.annotation.Version;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/API")
public class ApiVersionedController {
	
	
    @Version("1") 
    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String helloV1() {
        return "This is a Test API version 1";
    }
    
    
    @Version("2") 
    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String helloV2() {
        return "This is a Test API version 2";
    }
    
    
    @Version("3") 
    @Get("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String helloV3() {
        return "This is a Test API version 3";
    }
	
	
	

}
