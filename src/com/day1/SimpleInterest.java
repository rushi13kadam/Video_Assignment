package com.day1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		int principle=sc.nextInt();
		System.out.println("Enter rate");
		int rate=sc.nextInt();
		System.out.println("Enter time");
		int time=sc.nextInt();
		
		float simple=(principle*rate*time)/100;
		System.out.println("Simple interest="+simple);

	}

}
