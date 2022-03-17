package com.tp.UnderstandingBeanFatcory;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int value;
	private int age;
	private Computer com;
	
	public Alien() {
		
	}
	
	public Alien( int age,Computer com, int value) {
		//super();
		this.value = value;
		System.out.println("Constructor calling");
		this.age = age;
		this.com = com;
	}

	public int getAge() {
		return age;
	}
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		System.out.println("Setting Computer");
		this.com = com;
	}

	public void setAge(int age) {
		System.out.println("Setting age");
		this.age = age;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		System.out.println("Setting value");
		this.value = value;
	}
	public void code() {
		System.out.println("Coding......");
		com.compile();
	}

}
