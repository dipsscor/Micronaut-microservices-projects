package com.dipsscor;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@MicronautTest
public class AddNumberFunctionFunctionTest {

    @Inject
    AddNumberFunctionClient client;

    @Test
    public void testFunction() throws Exception {
    	AddNumberFunction body = new AddNumberFunction();
    	body.setFirst_number(100);
    	body.setSecond_number(2);
    	
        assertEquals(102, client.apply(body).blockingGet().getResult());
    }
}
