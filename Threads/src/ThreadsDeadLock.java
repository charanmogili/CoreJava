
public class ThreadsDeadLock {

	public static void main(String[] args) throws InterruptedException {
		Thread.currentThread().join();//there is only one thread,it is waiting on that thread to exist
		                              //it is called as DEADLOCK
	System.out.print("R");
	Thread.sleep(2000);
	System.out.print("C");
	Thread.sleep(2000);
	System.out.print("B");
	
	}
}
