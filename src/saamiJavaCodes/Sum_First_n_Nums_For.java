package saamiJavaCodes;
//program to print sum of n even numbers using FOR loop
public class Sum_First_n_Nums_For {
	public static void main(String args[]) {
		int n=10,sum=0;
		for(int i=0;i<=n;i++) {
		 
			if(i%2==0) {
			sum=sum + i;
			}
		
		}
		System.out.println(sum);
	}
}
