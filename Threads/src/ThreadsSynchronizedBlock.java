class Display2{
       public void wish(String name){ //l-lakh lines of code
//             synchronized(this)
    	   synchronized (this)
    	   {
    		   System.out.println("Thread which is getting the lock is:"+Thread.currentThread().getName());
                      for (int i=0;i<=3;i++ )
                        {
                           System.out.print("Good morning:");
                          try{
                                Thread.sleep(1000);
                             }
                          catch (InterruptedException e){
                        	  e.printStackTrace();
                          }
                          
                          System.out.println(name);
                        }
                      System.out.println("Thread which is releasing the lock is:"+Thread.currentThread().getName());
               }//1-lakh lines of code
   }
}
class MyThread5 extends Thread{
	
  Display2 d;
  String name;
  
  MyThread5(Display2 d,String name){
        this.d=d;
        this.name=name;
  }
  public void run(){
       d.wish(name);
  }
}
public class ThreadsSynchronizedBlock {

	public static void main(String[] args) {
		Display2 d1=new Display2();
		Display2 d2=new Display2();
		MyThread5 t1=new MyThread5(d1, "di caprio");
		MyThread5 t2=new MyThread5(d2, "Kate");
		
		t1.start();
		t2.start();
	}
}
