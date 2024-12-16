package saamiJavaCodes;



//code for threads
//implementation by extending the thread class;
class Thread5 extends Thread{
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Thread5 : "+i);
	}
	}
}
class Thread4 extends Thread{
	public void run() {
	for(int j=0;j<5;j++) {
		System.out.println("Thread4 : "+j);
	}
	}
}

public class Thread_Ex{
	public static void main(String args[]) {
		Thread5 t5=new Thread5();
		Thread4 t4= new Thread4();
		t4.setPriority(10);
		t5.start();
		t4.start();
	}
	
}