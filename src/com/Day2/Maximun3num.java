package com.Day2;

import java.util.Scanner;

public class Maximun3num {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("1st number Maximun="+num1);
		}
		else if(num2>num1 && num2>num3)
			{
				System.out.println("2nd number Maximun="+num2);
			}
		else
			{
				System.out.println("3rd number Maximun="+num3);
			}
		}
	}

