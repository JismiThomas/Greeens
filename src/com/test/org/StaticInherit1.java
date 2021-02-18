package com.test.org;

public class StaticInherit1 {
	public static int j=20;
	public void test() {
		int i=10;
		System.out.println("The value of LV is:"+i);
		System.out.println("The value of CV is:"+j);

	}
	public static void main(String[] args) {
		StaticInherit1 vd=new StaticInherit1();
		vd.test();
		
	}
	
}
