
interface Demo1{
	void m1();
	void m2();
	void m3();
	void m4();
	static String se8() {
		return "inside the interface method";
	}
	default int se9() {
		return 8;
	}
}

abstract class AdapterClass implements Demo1
{
	@Override
	public void m1() {
		// TODO Auto-generated method stub
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub	
	}
}

class AdapterImpl extends AdapterClass
{
	public void m3()
	{
		System.out.println("Adapter class implementaation");
	}
}

public class TestClass {
	public static void main(String[] args) {
		AdapterImpl ad=new AdapterImpl();
		ad.m3();
		System.out.println(Demo1.se8());
		System.out.println(ad.se9());
	}
}
