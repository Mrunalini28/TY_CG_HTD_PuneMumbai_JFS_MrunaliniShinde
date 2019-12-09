package com.capgemini.junitproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalculator {

	private Calculator calculator = null;

	@BeforeEach
	public void createobject() {

		 calculator = new Calculator();
	}

	@Test
	public void testAdd() {

		int i = calculator.add(10, 5);
		assertEquals(15, i);
	}

	@Test
	public void testSub() {

		int i = calculator.sub(10, 5);
		assertEquals(5, i);
	}

	@Test
	public void testDiv() {

		int i = calculator.div(10, 2);
		assertEquals(5, i);
	}

	@Test
	public void testMul() {

		int i = calculator.mul(10, 2);
		assertEquals(20, i);
	}

	@Test
	public void testAddNegative() {

		int i = calculator.add(10, -5);
		assertEquals(5, i);
	}

	@Test
	public void testDivDivideByZero() {

		assertThrows(ArithmeticException.class, () -> calculator.div(10, 0));
	}
}
