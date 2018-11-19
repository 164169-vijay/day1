package org.java.assignments;

import java.util.Scanner;

public class ArrayOperation {

	
	public static void main(String[] args) {
		ArrayOperation array= new ArrayOperation();
		int [] numbers =array.acceptValues();
		array.printValues(numbers);
		int [] desendingNumbers=array.desending(numbers);
		int maxValue=array.getHighestValue(desendingNumbers);
		System.out.println(maxValue);
		
	}
	
	 
	 //accepting values from user
	 public int [] acceptValues(){
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value no to enter");
			int x = sc.nextInt();
			int[] arr1 = new int[x];
			System.out.println("Enter your element");
			for (int index = 0; index < arr1.length; index++) 
			{
				arr1[index] = sc.nextInt();
			}
			return arr1;
	 }
	 
	 //sort the value in ascending order
	 public int [] ascending(int [] numbers){
		 int temp = 0;
			for (int index = 0; index < numbers.length; index++) {
				for (int innerindex = index + 1; innerindex < numbers.length; innerindex++) {
					if (numbers[innerindex] < numbers[index]) {
						temp = numbers[index];
						numbers[index] = numbers[innerindex];
						numbers[innerindex] = temp;
					}
				}
			}
			return numbers;
	 }
	 
	 //sort the value in descending  order
	 public int [] desending(int [] numbers){
		 int temp = 0;
			for (int index = 0; index < numbers.length; index++) {
				for (int innerindex = index + 1; innerindex < numbers.length; innerindex++) {
					if (numbers[innerindex] > numbers[index]) {
						temp = numbers[index];
						numbers[index] = numbers[innerindex];
						numbers[innerindex] = temp;
					}
				}
			}
			return numbers;
	 }
	 
	 //Return max value
	 
	 public int getHighestValue(int [] numbers){
		 return numbers[0];
	 }
	 
	 public void printValues(int [] numbers){
		 for (int number: numbers){
			 System.out.println(number);
		 }
	 }
	 
}
