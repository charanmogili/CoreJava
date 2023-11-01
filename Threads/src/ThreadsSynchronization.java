class Display1{
	//try static synchronized,synchronized
     public  void displayNumbers(){
          for (int i=1;i<=10 ;i++ )
            {
                System.out.print(i);
              try{
                   Thread.sleep(2000);
                  }
               catch (InterruptedException e){
                }
            }
}
     //try static synchronized,synchronized
     public synchronized void displayCharacters(){
          for (int i=65;i<=75 ;i++ ){

                System.out.print((char)i);
                  try{
                       Thread.sleep(2000);
                      }
                  catch (InterruptedException e){
                      }
              }
      }
}

class MThread1 extends Thread{
 Display1 d;
       MThread1(Display1 d){
           this.d=d;
          }
   @Override
   public void run(){
       d.displayNumbers();
       }
 }
class MThread2 extends Thread{
 Display1 d;
        MThread2(Display1 d){
            this.d=d;
          }
   @Override
   public void run(){
             d.displayCharacters();
          }
}

public class ThreadsSynchronization {

	public static void main(String[] args) {
		Display1 d1=new Display1();
		MThread1 t1= new MThread1(d1);
		MThread2 t2= new MThread2(d1);
		t1.start();
		t2.start();
	}
}
