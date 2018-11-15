package org.assignment.day1;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value no to enter");
		int x=sc.nextInt();
		int []arr=new int[x];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the value to find");
		int key=sc.nextInt();
		int pos=-1;
		int j;
		for( j=0;j<arr.length;j++)
		{
			if (arr[j]==key) {
				pos=5;
				break;
			}
		}
		if(pos==5)
		{
			System.out.println("Element found"+(j+1));
		}
	}
}
