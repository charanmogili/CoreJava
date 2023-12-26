class Demo1{
	static int a;
	static int count;
	
	static
	{
		a=35;
		System.out.println("Inside Static block :"+a);
	}
	
	{
		System.out.println("inside java block "+a);
		count++;
	}
	
	Demo1()
	{
		this(10,20);
		System.out.println(a);
	}
	
	Demo1(int b,int c)
	{
		System.out.println(b);
	}
}

public class StaticVar {
	
	public static void main(String[] args) {
		
		Demo1 d1=new Demo1();
		Demo1 d2=new Demo1(20,30);
		Demo1 d3=new Demo1();
		System.out.println("No.of Objects created-->"+Demo1.count);
	}
}
