package org.assignment.no5;

import java.awt.Rectangle;
import java.util.Scanner;

import javax.sound.sampled.Line;

public abstract class Shape {
	public abstract void draw();

	public static void main(String args[]) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		float length = sc.nextFloat();
		System.out.println("Enter the breadth of the rectangle");
		float breadth = sc.nextFloat();
		Rectangle rect = new Rectangle(length, breadth);
		rect.draw();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Enter the length of the line");
		float lengthline = sc.nextFloat();
		Line l = new Line(lengthline);
		l.draw();
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Enter the length of the square");
		float side = sc.nextFloat();
		Square sq = new Square(side);
		sq.draw();

	}
}
