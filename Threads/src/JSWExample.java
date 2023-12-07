
class JSWServiceClass  {
	
	public void checkAvailability() throws InterruptedException {
		for(int i=0;i<4;i++) {
			System.out.println("running checkAvailability method "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
	
	public void checkMaterials() throws InterruptedException {
		for(int i=0;i<4;i++) {
			System.out.println("running checkMaterials method "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
	
	public void checkResource() throws InterruptedException {
		for(int i=0;i<4;i++) {
			System.out.println("running checkResource method "+Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}

public class JSWExample {

	public static void main(String[] args) {

		JSWServiceClass jsw=new JSWServiceClass();
		
		Runnable run=()->{try {
			                    jsw.checkAvailability();
		                 } catch (InterruptedException e) 
		                      {
			                    e.printStackTrace();
		                      }
		                 };
		
		Thread thread1=new Thread(run, "thread1");
		Thread thread2=new Thread(run, "thread2");
		
		thread1.start();
		thread2.start();
	}
}
