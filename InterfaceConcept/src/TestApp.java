
interface IAccount
{
	int a =10;
}
interface IBank
{
	void m1();
	void checkBalance();
	void balance();
}


//class BankAccImpl implements IAccount,IBank
//{
//	public void checkBalance() {
//		System.out.println(a);
//	}
//	public void balance() {}
//	public void m1() {}
//}
//abstract class AccountImpl implements IAccount
//{
//	public void checkBalance() {}
//}
//
//class Imple extends BankAccImpl implements IBank
//{
//	
//	public void balance() {}
//	public void m1() {}
//}
//////////////////////////////////////////////////////////////


//case 1:
interface IDemo11{
	void m1();
}
interface IDemo12{
	void m1();
}

class DemoImpl implements IDemo11,IDemo12{
	public void m1() {}
}
//case 2:
interface IDemo21{
	void m1();
}
interface IDemo22{
	void m1(int i);
}

class DemoImpl2 implements IDemo21,IDemo22{
	public void m1() {}
	public void m1(int i) {}
}

//case 3:
interface IDemo31{
	void m1();
}
interface IDemo32{
	//int m1();
}

class DemoImpl3 implements IDemo31,IDemo32{
	public void m1() {
		System.out.println("inside m1");
		}
	//public int m1() {
	//	int i=10;
	//	return i;
	}//CE

	//case 4:
	interface IDemo212{
		void m1();
	}
	interface IDemo222{
		void m1(int i);
	}

	class DemoImpll implements IDemo212,IDemo222{
		public void m1() {}
		public void m1(int i) {}

public static class TestApp {

	public static void main(String[] args) {
	    int a=90;
		System.out.println(IAccount.a);
		System.out.println(a);
	}
}
	}
