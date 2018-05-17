package com.may15;
interface fir1
{void display();}
interface sec2
{void display1();}
interface third extends sec2
{void display2();}
public class interfaceexample implements fir1,third{
	public void display1()
	{ 
		System.out.println("display"); 
		}
	public void display(){
		
		System.out.println("display1");}
		public void display2(){
			
			System.out.println("display2");
			}
		

	
	public static void main(String[] args){
		interfaceexample ob=new interfaceexample();
		ob.display();
		ob.display1();
		ob.display2();


	}
	public void diplay1() {


	}
	public void diplay2() {
		// TODO Auto-generated method stub
		
	}
	public void diplay() {
		// TODO Auto-generated method stub
		
	}
	
}
