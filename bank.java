package com.may15;


import java.util.*;
interface Bankdetails
{
	void createAccount();
	void deposit();
	void withDraw();
	void balCheck();
}
public class bank implements Bankdetails {
	int accno,phneno;
	String name,email;
	int deposit,withdraw;
	int bal=500;
	public void createAccount() {
		// TODO Auto-generated method stub
		System.out.println("Enter account details");
		Scanner ob=new Scanner(System.in);
		accno=ob.nextInt();
		phneno=ob.nextInt();
		name=ob.next();
		email=ob.next();
		System.out.println("the account number is"+accno+"name is"+name+"phone number is"+phneno+"email id is"+email);
	}
	
		
	
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of amount deposited");
		Scanner ob=new Scanner(System.in);
		deposit=ob.nextInt();
		System.out.println("deposited amount"+deposit);
		
	}
	public void withDraw() {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of amount withdrawn");
		Scanner ob=new Scanner(System.in);
	    withdraw=ob.nextInt();
		System.out.println("withdrawn amount"+withdraw);
		
	}
	public void balCheck() {
		// TODO Auto-generated method stub
		System.out.println("Net balance details");
		bal=bal+deposit-withdraw;
		System.out.println("Remaining balance"+bal);
		
	}
	public static void main(String[] args)
	{
		bank b=new bank();
		b.createAccount();
		b.deposit();
		b.withDraw();
		b.balCheck();
	}
	
}
