package com.may15;

public class Constructexmp 
{
	int empno;
	String name,address;
	Constructexmp(int empno,String name,String address)
	{
		this.empno=empno;
		this.name=name;
		this.address=address;
	}
void display()
{System.out.println("empno is"+empno+"name is"+name+"address is"+address);
}
}