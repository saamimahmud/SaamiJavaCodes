package saamiJavaCodes;

public class NumberFormatException {
	public static void main(String args[]) {
		
		String name="Saami";
		try {
		int n=Integer.parseInt(name);
		System.out.print(n);
		}catch(Exception e) {
			System.out.println("NumberFormatException Caught : "+e);
		}finally{
			System.out.println("Code executed......");
		}
	}

}
