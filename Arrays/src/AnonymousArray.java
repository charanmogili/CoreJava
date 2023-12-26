
class Test{
	public void m1(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}

public class AnonymousArray {

	public static void main(String[] args) {
		Test t=new Test();
		t.m1(new int [] {1,2,3,4});
	}
}
