
class InterruptionWithoutSleepOrWaitingStateThread extends Thread{
	@Override
	public void run() {
		try {
			for(int i=0;i<3;i++) {
				System.out.println("child thread "+i);
			}
		}
		catch(Exception ie) {
			System.out.println("Thread got interrupted");
		}
	}
}
public class ThreadsInterruptionAfterDeadState {

	public static void main(String[] args) {
		InterruptionWithoutSleepOrWaitingStateThread it=new InterruptionWithoutSleepOrWaitingStateThread();
		it.start();
		it.interrupt();
		
	}

}
