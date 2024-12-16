package saamiJavaCodes;
	import java.util.Scanner;
	class MyException extends Exception{
		public String toString() {
			return "Heyyy...";
		}
		public String getMessage() {
			return "Hello";
			
		}
	}
public class Custom_Exception {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		float n=sc.nextInt();
		if (n!=3.14f) {try {
			throw new MyException();
		} catch(Exception e) {
			System.out.println(e);
		}
		}
	}
}
