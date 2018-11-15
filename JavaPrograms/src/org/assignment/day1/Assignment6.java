package org.assignment.day1;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Login name");
		String name=sc.nextLine();
		System.out.println("Enter the password");
		String pwd1=sc.nextLine();
		String pwd2="vkuma236";
		int count=0;
		do{
		if (pwd1==pwd2) {
			System.out.println("Enter your password\t"+name);
		}
		else{
			System.out.println("Retry");
		}
		}while(count<3);
	}

}
