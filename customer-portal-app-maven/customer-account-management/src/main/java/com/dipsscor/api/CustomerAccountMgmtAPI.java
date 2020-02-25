package com.dipsscor.api;

import javax.inject.Inject;

import com.dipsscor.pojos.ServiceResponse;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

import static io.micronaut.http.HttpRequest.GET;

import java.util.Map;

@Controller("/API")
public class CustomerAccountMgmtAPI {
	
	
	
	@Client("${acctmgmt.server.url:http://localhost:11001/API}") 
	@Inject RxHttpClient accthttpClient;
	
	
	@Client("${custmgmt.server.url:http://localhost:12001/API}") 
	@Inject RxHttpClient custhttpClient;
	
	
	
	@Get(value = "/healthcheck")
	@Produces(MediaType.APPLICATION_JSON)
	public HttpResponse<ServiceResponse> healthCheck() {
		
		ServiceResponse ServiceResponse = new ServiceResponse();
		ServiceResponse.setMessage("This is a Customer Account Management Service");
		
		return HttpResponse.ok(ServiceResponse);
		
	}
	
	
	
	@Get(value = "/healthcheck-accountmgmt")
	@Produces(MediaType.APPLICATION_JSON)
	public HttpResponse<ServiceResponse> healthCheckAccountMgmt() {
		
		/* This is a call to account-management /healthcheck URL*/
		
		Flowable<Map> response = accthttpClient.retrieve( GET("/healthcheck/"),Map.class);
		
		ServiceResponse ServiceResponse = new ServiceResponse();
		ServiceResponse.setMessage((String)response.blockingFirst().get("message"));
		
		return HttpResponse.ok(ServiceResponse);
		
	}
	
	
	@Get(value = "/healthcheck-customermgmt")
	@Produces(MediaType.APPLICATION_JSON)
	public HttpResponse<ServiceResponse> healthCheckCustomerMgmt() {
		
		/* This is a call to customer-management /healthcheck URL*/
		
		Flowable<Map> response = custhttpClient.retrieve( GET("/healthcheck/"),Map.class);
		
		ServiceResponse ServiceResponse = new ServiceResponse();
		ServiceResponse.setMessage((String)response.blockingFirst().get("message"));
		
		return HttpResponse.ok(ServiceResponse);
		
	}
	

}
