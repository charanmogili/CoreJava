class MyThread6 extends Thread{
	int total=0;
	
	public void run() {
		synchronized (this) {
			System.out.println("child thread started calculating");
			for(int i=1;i<=10;i++) {
				total+=i;
			}
			System.out.println("child thread giving notification");
		    this.notify();
		}
	}
}
public class ThreadsInterThreadCommunication {

	public static void main(String[] args) throws InterruptedException {
		MyThread6 t=new MyThread6();
		t.start();
		
		synchronized (t) {
			System.out.println("main thread calling wait()");
			t.wait();
			System.out.println("main thread getting notified");
			System.out.println(t.total);
		}
	}
}
