package com.may15;

public class Constructexmp1 extends Constructexmp  {
	int salary;
	String design;

	Constructexmp1(int empno, String name, String address,int salary,String design) 
		{
		super(empno, name,address);
	this.salary=salary;
	this.design=design;
	}
void display()
{
	super.display();
	System.out.println("the salary is"+salary+"designation is"+design);
}
public static void main(String[] args)
{
	Constructexmp1 ob=new Constructexmp1(101,"Sahithya","bangalore",450000,"off");
	ob.display();
}
}
