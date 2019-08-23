package com.thoughtworks.tdd;

public class fizzBussGame {

	public String fizzBuss(int number) {
		// TODO Auto-generated method stub
		if(number%3==0&&number%7==0) {
			return "fizzBuss";
		}
		else if(number%7==0) {
			return "buss";
		}
		else if(number%3==0) {
			return "fizz";
		}
		else {
			return "1";
		}
		
	}
	

}
