package org.assignment.day1;
import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       System.out.println("Enter marks of first subject");
       int first=sc.nextInt();
       System.out.println("Enter marks of second subject");
       int second=sc.nextInt();
	   System.out.println("Enter marks of third subject");
	   int third=sc.nextInt();
		int cutoff =180;
	   if (first>60&&second>60&&third>60){
		   System.out.println("Student is passed");
	   }
	   else if (first>60 && second>60 && third<60) {
		   System.out.println("Student is promoted");
		
	}
		

	}

}
