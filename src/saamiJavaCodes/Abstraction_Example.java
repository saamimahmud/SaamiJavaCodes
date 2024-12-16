package saamiJavaCodes;

public class Abstraction_Example{
	public static void main(String args[]) {
		Samsung831 mobile=new Samsung831();
		
		mobile.setDate(30, 04, 2001);
		mobile.getDate();
		mobile.isTouchScreen();
		mobile.gps();
		mobile.camera();
	}
	}

	
		abstract class CellPhone{
			int day,month,year;
			abstract public void recieveCall ();
			abstract public void message();
			abstract public void getDate();	
			public void setDate(int day,int month,int year) {
				this.day=day;
				this.month=month;
				this.year=year;
			}
		}
		
		abstract class SmartPhone extends CellPhone{
			abstract public void gps();
			abstract public void camera();
			public void isTouchScreen() {
				System.out.println("Yes it is Touchscreen!!");
			}
		}
		class Samsung831 extends SmartPhone {
			public void camera() {
				System.out.println("Can capture photo and video");
			}
			public void gps() {
				System.out.println("Can detect and show location !!");
			}
			public void getDate() {
				System.out.println("Date : "+day+"-"+month+"-"+year);
			}
			public void recieveCall() {
				System.out.println("Incoming call......");
			}
			public void message() {
				System.out.println("Messages Recieved!!");
			}
			
		}
		
	