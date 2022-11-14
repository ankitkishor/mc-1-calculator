package com.jap.calculator;

public class MathematicalCalculator {

	public int add(int num1, int num2)
	{
		return num1 + num2;
	}
	public int subtract(int num1, int num2)
	{
		return num1 - num2;
	}
	public int multiply(int num1, int num2)
	{

		return num1 * num2;
	}
	public int divide(int num1, int num2)
	{
		//write the code and handle the ArithmeticException
		try {


			if (num2 == 0) {
				return 0;
			}
		}catch (ArithmeticException exception){
			System.out.println(exception);
		}
		return num1 / num2;
	}
	public int modulo(int num1, int num2)
	{
		return num1 % num2;
	}
}
