package saamiJavaCodes;
//Sum first n even numbers using while loop.

public class Sum_First_Even_Nums {
	public static void main(String args[]) {
		
		int i = 0,n=10,sum=0;	
	while(i<=n) {
		if(i%2==0) {
		   sum=sum+i;
		   
		}
	i++;
	
	}
	
	System.out.println(sum);
	
	
	}	
	}
