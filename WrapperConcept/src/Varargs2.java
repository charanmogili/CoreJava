
public class Varargs2 {

	public static void main(String[] args) {
		Test t=new Test();
		t.m1();
		t.m1(10,20);
		t.m1(50);
	}
}

class Test{
	//... can be replaced with point int[] a
	//but int[] a cannot be replaced with ...
	public void m1(int... a)
	{
		System.out.println("inside ellipse method");
	}
	
	public void m1(int x)
	{
		System.out.println("inside int method");
	}

}