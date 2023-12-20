
class Displayy{
	//remove synchronized keyword and run
	//it makes only one thread to run at a time
	public  void wish(String name) {
		 for(int i=0;i<3;i++) {
			 System.out.println("Get a Life :"+name);
		 try {
			Thread.sleep(2000);
		 } 
		 catch (InterruptedException ie) {
			ie.printStackTrace();
		 }
		} 
	}
}

class MultiThreads extends Thread{
	Displayy d;
	String name;
	
	MultiThreads(Displayy d, String name) {
		this.d = d;
		this.name = name;
	}
	@Override
	public void run() {
		d.wish(name);
	}
}

public class ThreadsIntroToSynchronization {

	public static void main(String[] args) {
		Displayy d=new Displayy();
		MultiThreads mt1=new MultiThreads(d, "Charan");
		MultiThreads mt2=new MultiThreads(d, "Sachin");
		mt1.start();
		mt2.start();
	}
}
