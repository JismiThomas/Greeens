package com.test.org;

public class StudenyOverload {
	public void std(int id) {
		System.out.println(+id);
		
	}
	public void std(String name) {
		System.out.println("student name is " + name);
	} 
	public void std(char initial, String name) {
System.out.println("Student initial and name are " + initial+"."+name);
		
	}
	public static void main(String[] args) {
		StudenyOverload d=new StudenyOverload();
		d.std( 10);
		d.std("dito");
		d.std('K', "greens");
		
	}
	

}
