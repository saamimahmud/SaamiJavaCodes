package saamiJavaCodes;
	class Super{
		public void method() {
			System.out.println("Method of Super class called.");
		}
		}
	class Sub extends Super{
		
		public void method() {
			System.out.println("Method of Sub class called.");
		}
		}

public class Method_Overriding {
	public static void main(String args[]) {
		Super obj1=new Super();
		Super obj2=new Sub();
		Sub s1=new Sub();
		s1.method();
		obj1.method();
		obj2.method();
	
	}

}
