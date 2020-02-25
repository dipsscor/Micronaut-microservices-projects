package com.dipsscor.api;

import com.dipsscor.pojos.ServiceResponse;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;


@Controller("/API")
public class CustomerMgmtAPI {
	
	@Get(value = "/healthcheck")
	@Produces(MediaType.APPLICATION_JSON)
	public HttpResponse<ServiceResponse> healthCheck() {
		
		ServiceResponse ServiceResponse = new ServiceResponse();
		ServiceResponse.setMessage("This is a Customer Management Service");
		
		return HttpResponse.ok(ServiceResponse);
		
	}


}
