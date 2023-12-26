interface F1{
	public void m1();
	public void m2();
	public void m3();
}

class A implements F1{
	public void m1() {
		System.out.println("Inside Am1");
	}
	public void m2() {
		System.out.println("Inside Am2");
	}
	public void m3() {
		System.out.println("Inside Am3");
	}
}
class B implements F1{
	public void m1() {
		System.out.println("Inside Bm1");
	}
	public void m2() {
		System.out.println("Inside Bm2");
	}
	public void m3() {
		System.out.println("Inside Bm3");
	}
}

class C implements F1{
	public void m1() {
		System.out.println("Inside Cm1");
	}
	public void m2() {
		System.out.println("Inside Cm2");
	}
	public void m3() {
		System.out.println("Inside Cm3");
	}
}

public class Test2 {

	public static void main(String[] args) {
		F1 f;
		f=new A();
		f.m1();
		
	}
}
