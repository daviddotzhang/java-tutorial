package com.liferay.java8;

public interface IUser {

	public void sayA();
	
	default public void sayB(){
		System.out.println("this is a default method in the interface");
	}
}
