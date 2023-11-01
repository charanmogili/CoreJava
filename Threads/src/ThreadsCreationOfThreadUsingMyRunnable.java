
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("runnable thread");
		}
	}
}

public class ThreadsCreationOfThreadUsingMyRunnable {

	public static void main(String[] args) {

		MyRunnable myrunnable=new MyRunnable();
		
		Thread th=new Thread();
		th.start();//It is used to call to thread class run()
		Thread thread=new Thread(myrunnable);
		thread.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main thread");
		}
	}
}
