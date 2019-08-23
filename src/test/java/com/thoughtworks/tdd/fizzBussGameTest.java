package com.thoughtworks.tdd;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class fizzBussGameTest {
	@Test
	public void fizzBuss_given_1_then_1() {
		//given
		int number=1;
		fizzBussGame fizzBussGameNew =new fizzBussGame();
		
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("1",word);
	}
	@Test
	public void fizzBuss_given_3_then_fizz() {
		//given
		int number=3;
		fizzBussGame fizzBussGameNew =new fizzBussGame();
		
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("fizz",word);
	}
	
	@Test
	public void fizzBuss_given_7_then_buzz() {
		//given
		int number = 7;
		fizzBussGame fizzBussGameNew =new fizzBussGame();
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("whiss", word);
	}
	@Test
	public void fizzBuss_given_5_then_buzz() {
		//given
		int number = 5;
		fizzBussGame fizzBussGameNew =new fizzBussGame();
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("buss", word);
	}
	@Test
	public void fizzBuss_given_21_then_fizzBuss() {
		//given
		int number = 21;
		fizzBussGame fizzBussGameNew = new fizzBussGame();
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("fizzWhiss", word);
	}
	@Test
	public void fizzBuss_given_15_then_fizzBuss() {
		//given
		int number = 15;
		fizzBussGame fizzBussGameNew = new fizzBussGame();
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("fizzBuss", word);
	}
	@Test
	public void fizzBuss_given_35_then_fizzBuss() {
		//given
		int number = 35;
		fizzBussGame fizzBussGameNew = new fizzBussGame();
		//when
		String word = fizzBussGameNew.fizzBuss(number);
		//then
		Assertions.assertEquals("bussWhiss", word);
	}

}
