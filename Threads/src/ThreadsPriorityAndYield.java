class MyThread1 extends Thread{
	public void run() {
		System.out.println("inside child thread :"+Thread.currentThread().getPriority());
		
		Thread.yield();
		for(int i=0;i<3;i++) {
			System.out.println("child thread");
		}
	}
}
public class ThreadsPriorityAndYield {

	public static void main(String[] args) {
		System.out.println("main Thread :"+Thread.currentThread().getPriority());
//		Thread.currentThread().setPriority(7);
		System.out.println("main Thread :"+Thread.currentThread().getPriority());
		MyThread1 t=new MyThread1();
		t.setPriority(10);
		t.start();
//		t.setPriority(10);
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
	}
}
