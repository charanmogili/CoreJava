
class Demo{
	static int a;// static variables get life at the time of class loader itself,so it can be accessed anywhere
	static int b;
	
	static
	{
		System.out.println("Inside Static Block :"+a+" "+b);
	}
	
	static void disp()
	{
		System.out.println("Inside the static display method"+a);
	}
	
	int x;
	int y;
	Demo(int x,int y)
	{
		System.out.println("Inside Demo Class "+x+" "+y+"|||||||||||static varaible a is:"+a);
		
	}
	
	{
		System.out.println("Inside non-static block|||||||||||"+"static varaible a is:"+a);
	}
	
	void disp1()
	{
		System.out.println("Inside non-static method |||||||||"+"static varaible a is:"+a);
		
	}	
}

public class ControlFlow {

	public static void main(String[] args) {
		Demo.disp();
		Demo d=new Demo(10,20);
		d.disp1();
		}
}
