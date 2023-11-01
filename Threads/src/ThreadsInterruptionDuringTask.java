
class InterruptionThread extends Thread{
	public void run() {
		try {
		  for(int i=0;i<3;i++) {
			  System.out.println("child thread");
			  Thread.sleep(1000);
		  }
		}
		catch(InterruptedException ie) {
			System.out.println("Thread got interrupted");
		}
	}
}
public class ThreadsInterruptionDuringTask {

	public static void main(String[] args) {
		InterruptionThread it=new InterruptionThread();
		it.start();
		it.interrupt();
	}
}
