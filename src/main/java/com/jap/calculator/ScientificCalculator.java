package com.jap.calculator;

public class ScientificCalculator {

	public double cielOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call ceil method of Math class and return the value
		if (!(num<=0)){
			return Math.ceil(num);
		}
		else throw new CalculatorException("number can't be 0 or negative.");
	}
	
	public double floorOfANumber(float num) throws CalculatorException
	{
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
		//or else call floor method of Math class and return the value
		if(!(num<=0)){
			return Math.floor(num);
		}
		else throw new CalculatorException("number can't be 0 or negative.");
	}
	
    public long power(int num1, int num2) throws CalculatorException {
		//if num1 is less than num2 than throw the userdefined exception with proper message
		//else use Math pow method and return the value
		if(num2<0||num1<0){
			throw new CalculatorException("both numbers can't be or negative.");
		}

		return (long) Math.pow(num1,num2);
    }
    
    public double squareRoot(int num) throws CalculatorException
    {
		//check if num is equal to or less than 0 than throw the userdefined exception with proper message
			//or else call sqrt method of Math class and return the value
		if (num<=0){
			throw new CalculatorException("number can't be 0 or negative.");
		}
		return Math.sqrt(num);
    }

	public static void main(String[] args) {
		ScientificCalculator scientificCalculator = new ScientificCalculator();
		try {
			scientificCalculator.cielOfANumber(10.23f);
		} catch (CalculatorException e) {
			throw new RuntimeException(e);
		}
		//Call all the methods one by one and surround them by try and respective catch blocks.
		try {
			scientificCalculator.floorOfANumber(11.55f);
		}catch (CalculatorException exception){
			throw new RuntimeException(exception);
		}
		try {
			scientificCalculator.power(4,3);
		}catch (CalculatorException exception){
			throw new RuntimeException(exception);
		}
		try {
			scientificCalculator.squareRoot(144);
		}catch (CalculatorException exception){
			throw new RuntimeException(exception);
		}
	}
}
