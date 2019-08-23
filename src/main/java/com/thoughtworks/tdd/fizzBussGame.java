package com.thoughtworks.tdd;

public class fizzBussGame {

	public String fizzBuss(int number) {
		// TODO Auto-generated method stub
		if(number%3==0&&number%7==0) {
			return "fizzWhiss";
		}
		else if(number%7==0) {
			return "whiss";
		}
		else if(number%3==0) {
			return "fizz";
		}
		else if(number%5==0) {
			return "buss";
		}
		else {
			return "1";
		}
		
	}
	

}
