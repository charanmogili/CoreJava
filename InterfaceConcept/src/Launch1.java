interface I1{
	void mI1();
}
interface I2{
	void mI2();
}
interface I3{
	void mI3();
}

abstract class L2{
	abstract void m2();
}
abstract class L3{
	abstract void m3();
}
abstract class L4{
	abstract void m4();
}

class LL1{
	public void ll1() {
		System.out.println("insde ll1");
	}
}
class LL2{
	public void ll2() {
		System.out.println("insde ll2");
	}
}
class L5 extends L2{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}
//	void m2() {
//		System.out.println("inside m2");
//	}
//	public void mI1() {
//		System.out.println("inside mI1");
//	}
//	public void mI2() {
//		System.out.println("inside mI2");
//	}
}

public class Launch1 {

	public void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
