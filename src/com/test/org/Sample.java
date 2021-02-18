package com.test.org;

public class Sample {
	
	public static boolean validation(String a, String b) {
		if (a.equals(b)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(validation("arun", "Arun"));
	}
}
