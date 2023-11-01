
public class ThreadCreationUsingAnonymousInnerClass {

	public static void main(String[] args) {

//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				for(int i=0;i<3;i++) {
//					System.out.println("child thread");
//				}
//			}
//		}).start();
		
		new Thread(()->{
			for(int i=0;i<3;i++) {
				System.out.println("child thread");
			}
		}).start();
		
		for(int i=0;i<3;i++) {
			System.out.println("main thread");
		}
	}
}
