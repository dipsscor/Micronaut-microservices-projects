package com.dipsscor.api;

import com.dipsscor.pojos.ServiceResponse;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

@Controller("/API")
public class AccountMgmtAPI {
	
	@Get(value = "/healthcheck")
	@Produces(MediaType.APPLICATION_JSON)
	public HttpResponse<ServiceResponse> healthCheck() {
		
		ServiceResponse ServiceResponse = new ServiceResponse();
		ServiceResponse.setMessage("This is a Account Management Service");
		
		return HttpResponse.ok(ServiceResponse);
		
	}

}
