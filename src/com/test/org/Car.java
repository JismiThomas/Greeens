package com.test.org;

public class Car extends Bus{
	@Override
	public void busName() {
		super.busName();
		System.out.println("Prasadam");
	}

public static void main(String[] args) {
	Car cb = new Car();
	cb.busName();
}
	}


