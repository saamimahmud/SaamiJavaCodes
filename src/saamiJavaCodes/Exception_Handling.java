package saamiJavaCodes;
//Using TRY-Catch
public class Exception_Handling {
	public static void main(String args[]) {
		
		int a=50;
		int b=0;
		try {
		int divide=a/b;
		
		System.out.println("the division of a nd b : "+divide);
		}catch(Exception e) {
			System.out.println("the division could not take place. the reason :");
			System.out.println(e);
		}
		
		
		
	}
}
