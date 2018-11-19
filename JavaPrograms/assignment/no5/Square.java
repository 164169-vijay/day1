package org.assignment.no5;

public class Square extends Shape {
	public float side;
	public Square(float side) {
		this.side = side;
	}
	@Override
	public void draw() {

		float area = side * side;
		float perimeter = 4 * side;
		System.out.println("The area of a Square is " + area);
		System.out.println("The perimeter of a Square is " + perimeter);

	}	
}