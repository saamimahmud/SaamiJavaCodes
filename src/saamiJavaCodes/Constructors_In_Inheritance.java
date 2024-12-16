package saamiJavaCodes;
// Constructors in Inheritance !
 class Base{
	Base(){
		System.out.println("I am constructor of Base class");
	}
	Base(int a,int b){
		System.out.println("I am an overloaded constuctor of Base with value of  and b as :"+a+b);
	}
	Base(int a,int b,int c){
		System.out.println("I am an overloaded constuctor of Base with value of a,b and c as :"+a+" "+b+" "+c);
	}
 }
 
class Derived extends Base{
	
	Derived(){
		//super(5);
		System.out.println("I am a constructor of Derived class");
	}
	Derived(int x,int y){
		//super(7);
		System.out.println("I am an overloaded constructor of Derived class with x:"+x+" and y:"+y);
	}
	Derived(int a,int b,int c){
		System.out.println("I am an overloaded constuctor of Derived with value of a,b and c as :"+a+" "+b+" "+c);
	}
	
}
class GrandChild extends Derived{
	GrandChild(){
		super(2,3);
		System.out.println("I am constructor of GrandChild class");
	}
}

public class Constructors_In_Inheritance {
	public static void main(String args[]) {
	//Derived D=new Derived(10,5);
	//Base B=new Base();	
	GrandChild G=new GrandChild();
	}
}
