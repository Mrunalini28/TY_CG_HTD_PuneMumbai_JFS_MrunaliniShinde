package com.capgemini.junitproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {

		Sum s = new Sum();
		int i = s.add(10, 5);
		assertEquals(15, i);
	}
	
	@Test
	public void testAdd2() {

		Sum s = new Sum();
		int i = s.add2(10, 5, 5);
		assertEquals(20, i);
	}
}