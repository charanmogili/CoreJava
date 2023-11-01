
class MyThread extends Thread{
	@Override
	public void run() {
		String name=Thread.currentThread().getName();
		System.out.println("name of thread :"+name);//3:name of thread :thread:0
		
		Thread.currentThread().setName("charan");
		System.out.println("name of thread :"+Thread.currentThread().getName());//4:name of thread :charan
	}
}

public class Test2 {

	public static void main(String[] args) {
		String name=Thread.currentThread().getName();
		System.out.println("name of thread :"+name);//1:name of thread :thread:main
		
		MyThread t=new MyThread();
		t.start();
		
		Thread.currentThread().setName("Kate"); //
		System.out.println("changed name of main thread :"+Thread.currentThread().getName());
		//2:changed name of main thread :kate
		System.out.println(10/0);
	}
}
