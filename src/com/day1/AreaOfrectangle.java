package com.day1;

import java.util.Scanner;

public class AreaOfrectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lenght;
		System.out.println("Enter Lenght");
		lenght=sc.nextInt();
		
		int weight;
		System.out.println("Enter weight");
		weight=sc.nextInt();
		
		int x=lenght*weight;
		System.out.println("Area of rectangle="+x);

	}

}
