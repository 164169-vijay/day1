package org.assignment.day1;

import java.util.Scanner;

public class Assignment5 {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ctc");
		int ctc=sc.nextInt();
		System.out.println("your ctc is "+ctc);
		if (ctc<0) {
			System.out.println("your ctc is wrong");
		}
		else if (ctc>0 && ctc <180000) {
			System.out.println("your payable tax is nil");
		}
		else if (180001>0 && ctc <300000) {
			System.out.println("your payable tax is nil\t"+ctc*0.1);
		}
		else if (ctc>300001 && ctc <500000) {
			System.out.println("your payable tax is nil\t"+ctc*0.2);
		}
		else if (ctc>500001 && ctc <1000000) {
			System.out.println("your payable tax is nil\t"+ctc*0.3);
		}
		else 
		{
			System.out.println("your income is too high");
		}

	}

}
