package com.dipsscor;

import io.micronaut.function.executor.FunctionInitializer;
import io.micronaut.function.FunctionBean;
import javax.inject.*;
import java.io.IOException;
import java.util.function.Function;

@FunctionBean("add-number-function")
public class AddNumberFunctionFunction extends FunctionInitializer implements Function<AddNumberFunction, AddNumberFunctionResult> {

    @Override
    public AddNumberFunctionResult apply(AddNumberFunction _numbers) {
    	
    	Double result = _numbers.getFirst_number()+_numbers.getSecond_number();
    	AddNumberFunctionResult finalresult = new AddNumberFunctionResult();
    	finalresult.setResult(result);
    	
         return finalresult;
    }

    /**
     * This main method allows running the function as a CLI application using: echo '{}' | java -jar function.jar 
     * where the argument to echo is the JSON to be parsed.
     */
    public static void main(String...args) throws IOException {
        AddNumberFunctionFunction function = new AddNumberFunctionFunction();
        function.run(args, (context)-> function.apply(context.get(AddNumberFunction.class)));
    }    
}

