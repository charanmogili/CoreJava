class MyThreaaddd extends Thread{
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++) {
			total+=i;
		}
	}
}
public class Test12 {

	public static void main(String[] args) throws InterruptedException {
		MyThreaaddd t=new MyThreaaddd();
		t.start();
		
		System.out.println("Number of threads active are: "+Thread.activeCount());
		t.join();
		System.out.println("Number of threads active are: "+Thread.activeCount());
		System.out.println(t.total);
	}
}
