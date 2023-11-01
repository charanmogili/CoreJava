class MyThread3 extends Thread{
	public void run() {
		try {
			for(int i=0;i<3;i++) {
			System.out.println("child thread "+i);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("interruption occured");
		}	
	}
}
public class ThreadsInterruptionAfterTask {

	public static void main(String[] args) throws InterruptedException {
		MyThread3 t=new MyThread3();
		t.start();	
		t.interrupt();
		
	}
}
