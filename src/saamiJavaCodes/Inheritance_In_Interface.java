package saamiJavaCodes;

//Inheritance in Interfaces !

interface Interface1{
	public void meth1();
	public void meth2();
}
interface  Interface2 extends Interface1 {
	public void meth3();
	public void meth4();
}
class Class implements Interface2{
	public void meth3() {
		System.out.println("meth 3");
}
	public void meth4() {
		System.out.println("meth 4");
	}
	public void meth1() {
		System.out.println("meth 1");
	}
	public void meth2() {
		System.out.println("meth 2");
	}
}
public class Inheritance_In_Interface {
	public static void main(String args[]) {
		Class c=new Class();
		c.meth1();
	} }

