package com.dipsscor.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class ApiController {
	
    @Get(value = "/hello", produces = MediaType.TEXT_PLAIN) 
    public String index() {
        return "Hello World"; 
    }

}
