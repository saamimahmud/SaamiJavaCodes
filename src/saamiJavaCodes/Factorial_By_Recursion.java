package saamiJavaCodes;

public class Factorial_By_Recursion{
	
	static int Factorial(int n) {
		if(n==0 || n==1) {
			
			return 1;
		} else {
			return n*Factorial(n-1);}
		
	}

public static void main(String args[]) {
	int x=Factorial(5);
	System.out.println(x);
	
	
}
}