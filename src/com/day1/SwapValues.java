package com.day1;

import java.util.Scanner;

public class SwapValues {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Before swap value");
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println(" first number="+num1);
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("second number="+num2);
		
		/*int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After swap value");
		System.out.println("first number="+num1);
		System.out.println("second number="+num2);*/
		
		
		num1=num1-num2;
		num2=num1+num2;
		num1=num2-num1;
		
		System.out.println("After swap value");
		System.out.println("first number="+num1);
		System.out.println("second number="+num2);
		
		

	}

}
