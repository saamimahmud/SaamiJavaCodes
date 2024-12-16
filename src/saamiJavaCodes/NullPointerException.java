package saamiJavaCodes;
public class NullPointerException {
	public static void main(String args[]) {
	String n=null;
	try {
	System.out.println(n.toUpperCase());
	}catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Code executed.....");
	}
	
	}
	
}
