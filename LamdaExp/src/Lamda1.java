@FunctionalInterface
interface Demo1{
	//interface with only one abstract method is called functional Interface
	//lamda expressions only work with functional interfaces
	void disp();
}
public class Lamda1 {

	public static void main(String[] args) {
		Demo1 d1=()->System.out.println("Hello");
		d1.disp();
		
//		Demo1 d1=new Demo1() {//Anonymous class
//			public void disp() {
//				System.out.println("Hello");
//			}
//		};
//		d1.disp();
	}
}
