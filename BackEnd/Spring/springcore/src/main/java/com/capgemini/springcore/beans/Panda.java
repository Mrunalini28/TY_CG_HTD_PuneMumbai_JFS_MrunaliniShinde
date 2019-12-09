package com.capgemini.springcore.beans;

import com.capgemini.springcore.interfaces.Animal;

public class Panda implements Animal {

	@Override
	public void eat() {
		System.out.println("Eating Bamboo");
	}// End od eat

	@Override
	public void speak() {
		System.out.println("Panda Squeaks");
	}// End of speak

	@Override
	public void walk() {
		System.out.println("Panda walking..");
	}// End of walk

}
