class Display{
	public synchronized void  wish1(String name) {
		for(int i=0;i<3;i++) {
			System.out.print("Good Evening :");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
	public synchronized void  wish2(String name) {
		for(int i=0;i<3;i++) {
			System.out.print("Good Evening :");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
	
	public void  wish3(String name) {
		for(int i=0;i<3;i++) {
			System.out.print("Good Evening :");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}
	}
}

class MyThread4 extends Thread{
	Display d;
	String name;
	
	MyThread4(Display d,String name){
		this.d=d;
		this.name=name;
	}
	
	public void run() {
		d.wish1(name);
		d.wish2(name);
		d.wish3(name);
	}
} 
public class Synchronized1 {

	public static void main(String[] args) {
		Display d1=new Display();
//		Display d2=new Display();
		MyThread4 t1=new MyThread4(d1,"sachin");
		MyThread4 t2=new MyThread4(d1,"danush");
		MyThread4 t3=new MyThread4(d1,"arjun");
		
		t1.start();
		t2.start();
		t3.start();
	}
}
