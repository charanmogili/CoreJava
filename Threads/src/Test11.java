class MyThreaad extends Thread{
	int total=0;
	public void run() {
		for(int i=1;i<=100;i++) {
			total+=i;
		}
	}
}
public class Test11 {

	public static void main(String[] args) throws InterruptedException {
		MyThreaad t=new MyThreaad();
		t.start();
		
		Thread.sleep(1000);
		System.out.println(t.total);
	}
}
