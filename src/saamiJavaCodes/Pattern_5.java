package saamiJavaCodes;

public class Pattern_5 {
	public static void main(String args[]) {
		int n=5,count=1;
		for(int i=1;i<n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			
			System.out.println();
			}
		
	
	}

}
