package saamiJavaCodes;

//code for threads
//implementation by extending the thread class;
class Thread6 implements Runnable{
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Thread6 : "+i);
	}
	}
}
class Thread7 implements Runnable{
	public void run() {
	for(int j=0;j<5;j++) {
		System.out.println("Thread7 : "+j);
	}
	}
}
public class ThreadCreation{
	public static void main(String args[]) {
		Thread6 t6=new Thread6();
		Thread7 t7=new Thread7();
		Thread t6obj=new Thread(t6);
		Thread t7obj=new Thread(t7);
		t6obj.start();
		t7obj.start();
		t7obj.setPriority(10);
		
	}
}