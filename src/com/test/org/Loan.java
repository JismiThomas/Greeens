package com.test.org;

public class Loan {
public void carLoan() {
	System.out.println("Interest for the carloan is 12%");

}
public void bikeLoan() {
	System.out.println("Interest for the bikeloan is 15%");

}
public static void main(String[] args) {
	Loan cl = new Loan();
	cl.carLoan();
	cl.bikeLoan();
}
}
