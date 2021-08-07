package IoStream;

import java.util.Scanner;

public class Rectangle {
	double length;
	double width;
	double area;
	String colour;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double a1 = sc.nextDouble();
		double b1 = sc.nextDouble();
		Rectangle obj1 = new Rectangle();
		Rectangle obj2 = new Rectangle();
		if(obj1.findArea(a , b) == obj2.findArea(a1 , b1) && obj1.getcolor("Red") == obj2.getcolor("Red")) {
			System.out.println("Matching Rectangles");
		}else {
			System.out.println("Not Matching Rectangles");
		}
	}
	void getlength(double length) {
		System.out.println("length is : " + length);
	}
	void getwidth(double width) {
		System.out.println("width is : " + width);
	}
	String getcolor(String colour) {
		return colour;
	}
	double findArea(double length , double width) {
		this.length = length;
		this.width = width;
		return length*width;
	}
}
