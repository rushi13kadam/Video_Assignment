package com.day1;

import java.util.Scanner;

public class TotalPer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first subject");
		int sub1=sc.nextInt();
		System.out.println("Enter second subject");
		int sub2=sc.nextInt();
		System.out.println("Enter third subject");
		int sub3=sc.nextInt();
		System.out.println("Enter four subject");
		int sub4=sc.nextInt();
		System.out.println("Enter five subject");
		int sub5=sc.nextInt();
		
		
		int total;
		float per;
		total=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total marks="+total);
		
		per=total*100/500;
		System.out.println("per marks="+per);

	}

}
