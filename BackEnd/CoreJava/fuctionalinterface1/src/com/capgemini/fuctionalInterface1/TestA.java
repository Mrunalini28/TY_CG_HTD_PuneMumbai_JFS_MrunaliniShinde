package com.capgemini.fuctionalInterface1;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {

		Predicate<Integer> p = (i) -> {

			if (i % 2 == 0) {
				return false;
			} else {
				return true;
			}
		};
		boolean a = p.test(15);
		System.out.println("result is: " + a);
	}
}