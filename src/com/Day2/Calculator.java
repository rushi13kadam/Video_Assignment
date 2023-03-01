package com.Day2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		System.out.println("Enter Choices ");
		System.out.println("1.Add \t 2.Subtract \t 3.Multiply \t 4.Divide");
		int op=sc.nextInt();
		
		switch(op)
		{
		case 1:System.out.println("Addition="+(num1+num2));
		break;
		case 2:System.out.println("Subtract="+(num1-num2));
		break;
		case 3:System.out.println("Multiply="+(num1*num2));
		break;
		case 4:System.out.println("Divide="+(num1/num2));
		break;
		default:
			System.out.println("Plese entr correct number");
		}
		
	}

}
