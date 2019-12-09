package com.capgemini.junitproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Factorialtest {

	@Test
	public void testFactForNumber() {
		Factorial fact =new Factorial();
		int i= fact.fact(5);
		assertEquals(120, i);
	}
	@Test
	public void testFactNegative() {
		Factorial fact =new Factorial();
		int i= fact.fact(-6);
		assertEquals(1, i);
	}
	@Test
	public void testFactZero() {
		Factorial fact =new Factorial();
		int i= fact.fact(0);
		assertEquals(1, i);
	}
}