package com.day1;

import java.util.Scanner;

public class Aritjmetic_operation
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		int addition=num1+num2;
		System.out.println("Addition is="+addition);
		
		int Multiplication=num1*num2;
		System.out.println("Multiplication is="+Multiplication);
		
		int subtraction=num1-num2;
		System.out.println("subtraction is="+subtraction);
		
		int division=num1/num2;
		System.out.println("division is="+division);
		
		int module=num1%num2;
		System.out.println("module is="+module);
	}

}