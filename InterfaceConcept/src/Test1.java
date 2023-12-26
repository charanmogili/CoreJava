interface Demo{
	void m1();
	void m();
}

//abstract class Demo11{
//	public void m5() {
//		System.out.println("Inside m5");
//	}
//}
class Demo2 implements Demo{
	public void m1() {
		System.out.println("Inside m1");
	}
	void m2() {
		System.out.println("Inside m2");
	}
	@Override
	public void m() {
		System.out.println("inside m()");
		
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Demo2 d1=new Demo2();
//		Demo11 d;
//		d=d1;
//		d.m5();	
		Demo d=new Demo2();
		String name = d.getClass().getName();
		System.out.println(name);
	}
}
