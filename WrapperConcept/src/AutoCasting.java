
public class AutoCasting {

	public static void m1(float l)
	{
		System.out.println("widening");
	}
	public static void m1(Integer i)
	{
		System.out.println("var-args");
	}
	public static void main(String[] args) {
		int x=10;
		m1(x);
	}
}
