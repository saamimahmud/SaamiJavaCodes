package saamiJavaCodes;
/*QUESTION :
 * Design an interface called Shape with methods draw() and 
getArca(). Further design two classes called Circle and Rectangle 
that implements Shape to compute area of respective shapes. Use 
same 
 */

interface Shape{
	
	public void draw();
	public void getArea();
}
class Circle implements Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public void getArea() {
		double area =3.13*radius*radius;
		System.out.println("Area of circle = "+area);
	}
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Rectangle implements Shape{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void setLengthBreadth(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public void setLength(double length) {
		this.length=length;
		
	}
	public void setBreadth(double breadth) {
		
		this.breadth=breadth;
	}
	public double getLength() {
		return length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void getArea() {
		double area= length*breadth;
		System.out.println("Area of rectange = "+area);
	}
	public void draw() {
		System.out.println("drawing rectangle of length and breadth : "+length+","+breadth);
	}
	
}


public class Interface_MultInheritance {
	public static void main(String args[]) {
		Circle c=new Circle(5);
		Rectangle r=new Rectangle(6,7);
		c.getArea();
		r.getArea();
	}
	
}
