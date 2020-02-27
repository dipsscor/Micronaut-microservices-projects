package com.dipsscor;

import io.micronaut.function.client.FunctionClient;
import io.micronaut.http.annotation.Body;
import io.reactivex.Single;
import javax.inject.Named;

@FunctionClient
public interface AddNumberFunctionClient {

    @Named("add-number-function")
    Single<AddNumberFunctionResult> apply(@Body AddNumberFunction body);

}
