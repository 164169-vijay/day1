package org.assignment.no5;

public class Rectangle extends Shape{
	
	public float length;
	public float breadth;

	public Rectangle(float length, float breadth) {

		this.length = length;
		this.breadth = breadth;

	}

	@Override
	public void draw() {

		float area = length * length;
		float perimeter = 2 * (length + breadth);
		System.out.println("The area of a Rectangle is " + area);
		System.out.println("The perimeter of a Rectangle is " + perimeter);

	}

}
