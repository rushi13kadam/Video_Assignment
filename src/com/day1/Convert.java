package com.day1;

import java.util.Scanner;

public class Convert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Day");
		int day=sc.nextInt();
		
		int year=day/365;
		int weeks=day/7;
		int days=day-((year*365)+(weeks*7));
		
		System.out.println("number of year="+year);
		System.out.println("number of weeks="+weeks);
		System.out.println("number of days="+days);
		
	}

}
