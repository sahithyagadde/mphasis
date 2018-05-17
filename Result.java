package com.may15;
import java.util.*;
class student
{
	int rollno;
	String name;
	String email;
	   void input()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter rollno,name,email");
		rollno=ob.nextInt();
		name=ob.next();
		email=ob.next();
	}
	void display()
	{
		System.out.println("the rollno is"+rollno);
		System.out.println("the name is"+name);
		System.out.println("the email is"+email);
	}
	}
	class Result extends student
	{
		float m1,m2,m3,total,avg;
		void input1()
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("enter m1,m2,m3");
			m1=ob.nextFloat();
			m2=ob.nextFloat();
			m3=ob.nextFloat();
			total=(m1+m2+m3);
			avg=(m1+m2+m3)/3;
			}
		void display1()
		{
			System.out.println("the total is"+total);
			System.out.println("the avg is"+avg);
		}
		public static void main(String[] args)
		{
			Result ob1= new Result();
			ob1.input();
			ob1.display();
			ob1.input1();
	
			ob1.display1();
		} 
	}
	
	

