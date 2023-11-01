class MyThread2 extends Thread{
	static Thread th;
	@Override
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName());
			th.join();
			System.out.println(Thread.currentThread().getName());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<3;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class ThreadsJoinMethodMain {

	public static void main(String[] args) throws InterruptedException {
		MyThread2.th = Thread.currentThread();
		System.out.println(Thread.currentThread().getName());
		MyThread2 t=new MyThread2();
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		for(int i=0;i<3;i++) {
			t.sleep(2000);
			System.out.println("main Thread");
		}
	}
}
