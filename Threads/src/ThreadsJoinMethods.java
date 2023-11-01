
class UserThread extends Thread{
	public void run() {	
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<4;i++) {
			System.out.println("Jack");
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		}
	}
}
public class ThreadsJoinMethods {
	public static void main(String[] args) throws InterruptedException {
		UserThread t=new UserThread();
		System.out.println(t.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		t.start();
		System.out.println(t.currentThread().getName());
		System.out.println(Thread.currentThread().getName());
		t.join(); //main thread is waiting for child thread
//		t.join(3000);
//		t.join(1000, 10);
		for(int i=0;i<3;i++) {
		System.out.println("Rose");
		}
	}
}
