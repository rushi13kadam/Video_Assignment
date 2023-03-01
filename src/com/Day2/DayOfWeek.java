package com.Day2;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number 1 to 7");
		int num=sc.nextInt();;
		
		
		switch(num)
		{
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wed");
		break;
		case 4:System.out.println("Monday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Sat");
		break;
		case 7:System.out.println("Sunday");
		break;
		default:
			System.out.println("error,day does not exist");
		}

	}

}
