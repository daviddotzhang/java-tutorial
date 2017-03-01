package com.liferay.java8;

public interface IPerson {

	public void sayA();
	
	default public void sayB(){
		//
	}
}
