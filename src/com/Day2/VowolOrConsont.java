package com.Day2;

import java.util.Scanner;

public class VowolOrConsont {

	public static void main(String[] args) {
	
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter char");
		char ch=sc.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println("This is vowol");
		}
		else
		{
			System.out.println("Tnis is Consont");
		}*/
		char c;
		
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter char");
			char ch=sc.next().charAt(0);
			
			switch(ch)
			{
			case 'a': System.out.println("This is vowol");
			break;
			case 'e': System.out.println("This is vowol");
			break;
			case 'i': System.out.println("This is vowol");
			break;
			case 'o': System.out.println("This is vowol");
			break;
			case 'u': System.out.println("This is vowol");
			break;
			case 'A': System.out.println("This is vowol");
			break;
			case 'E': System.out.println("This is vowol");
			break;
			case 'I': System.out.println("This is vowol");
			break;
			case 'O': System.out.println("This is vowol");
			break;
			case 'U': System.out.println("This is vowol");
			break;
			default:
				System.out.println("This is consont");
				break;
			}
			System.out.println(" Do you want to Continue");
			c=sc.next().charAt(0);	
		}while(c=='Y' || c=='y');

	}

}
