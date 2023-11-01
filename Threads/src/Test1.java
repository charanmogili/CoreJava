
class MyRunnable11 implements Runnable{
	public void run() {
		System.out.println("Inside MyThread run()");
	}
}

public class Test1 {

	public static void main(String[] args) {
		MyRunnable11 mt=new MyRunnable11();
		Thread t=new Thread(mt);
		t.start();
		
		for(int i=0;i<3;i++) {
		System.out.println("inside main thread");
		}
	}
}
