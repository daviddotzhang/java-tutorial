package com.liferay.java8;

public class SmallUser implements IUser,IPerson{

	@Override
	public void sayA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sayB() {
		// TODO Auto-generated method stub
		IPerson.super.sayB();
	}

}
