package saamiJavaCodes;
/*
public class Array {
	public static void main(String args[]) {
		int []marks= {90,78,89,35,77};
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
	}}}
*/
//*************************New Syntax in JAVA **********************
public class Array{
	public static void main(String args[]) {
		int [] marks= {90,50,77,89,69};
		for(int elements : marks) {
			System.out.println(elements);
		}
	}
}