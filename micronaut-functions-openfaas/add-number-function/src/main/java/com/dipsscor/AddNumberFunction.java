package com.dipsscor;

import io.micronaut.core.annotation.*;

@Introspected
public class AddNumberFunction {


	private double first_number;
    
    private double second_number;
    
    
    public double getFirst_number() {
		return first_number;
	}

	public void setFirst_number(double first_number) {
		this.first_number = first_number;
	}

	public double getSecond_number() {
		return second_number;
	}

	public void setSecond_number(double second_number) {
		this.second_number = second_number;
	}

}

