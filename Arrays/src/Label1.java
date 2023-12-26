
public class Label1 {

	public static void main(String[] args) {
		l1:{
		for(;;) {
			l2:for(;;) {
				l3:for(;;) {
					System.out.println("inside f3");
					break l2;
				}
//				System.out.println("inside f2");
			}
//			System.out.println("inside f1");
		}
		
	}
	}

}
