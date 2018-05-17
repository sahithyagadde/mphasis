package com.may15;
import java.util.*;
abstract class abstractClass
{
	abstract void inputStudentdetails();
	abstract void inputStudentMarks();
	abstract int sum(int a,int b);
	void studentClass()
	{
		System.out.println("He is student of class X");
	}
}

public class abstractexample extends abstractClass
{
	void inputStudentdetails()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter rollno,name of student");
		int rollno=ob.nextInt();
		String name=ob.next();
		System.out.println("the rollno is "+rollno+"the name is"+name);
	}
	void inputStudentMarks()
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter physics,chemistry,biology marks");
		int phy=ob.nextInt();int chem=ob.nextInt();
	    int bio=ob.nextInt();
	    int total=phy+chem+bio;
	    System.out.println("the total marks is"+total);
	}
	public static void main(String[] args){
		abstractexample ob=new abstractexample();
		ob.inputStudentdetails();
		ob.studentClass();
		ob.inputStudentMarks();
		System.out.println("the sum is"+ob.sum(6,7)); 
	}

	int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
}

