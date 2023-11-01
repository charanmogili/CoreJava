
class MThread extends Thread{
	public void run() {
		System.out.println("Inside run thread");
		run(5);
	}
	public void run(int i)
	{
		System.out.println("run with parameter");
	}
}

public class ThreadsCreationOfThreadUsingThreadClass {
	public static void main(String[] args) {
		MThread t=new MThread();
		t.start();
		t.run();
//		t.start(); //cannot start a thread once again till it goes to dead state
		System.out.println("inside main method");
		t.run(5);
		}
	}

