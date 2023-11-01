
/*
	interface Runnable{
		public abstract void run();
	}
	class Thread implements Runnable
	{
		//Heart of MultiThreading
		public void start(){
			1. Register the thread with ThreadScheduler
			2. All other mandatory low level activities(memory level)
			3. invoke or call run() method
		}
		public void run()
		{
			//no implementation
		}
	}
*/
class MyRunnable12 implements Runnable
{
	@Override
	public void run(){
		for (int i =1;i<=10 ;i++ )
		{
			System.out.println("child thread");
		}
	}	
}
public class RunnableExmp {

	public static void main(String[] args) {
		MyRunnable12 r = new MyRunnable12();
		Thread t = new Thread(r);
		t.start();

		// 2 threads, main thread and userdefined thread
		for (int i =1;i<=10 ;i++ )
		{
			System.out.println("main thread");
		}
	}
}
