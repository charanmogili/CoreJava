
import java.util.Scanner;

class Farmer{
	private float pamt;
	private int t;
	private float si;
	private static float r;
	static int count;
	
	static
	{
		r=0.75f;
	}
	
	void compute()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Farmer "+ ++count +" Enter the Principle Amount");
		pamt=scan.nextFloat();
		System.out.println("Enter the Time Period");
		t=scan.nextInt();
	}
	
	void interest()
	{
		si=(pamt*t*r)/100;
		System.out.println("Simple Interest for Farmer"+ count + ":"+si);
	}
}

public class Loan {

	public static void main(String[] args) {
		Farmer f1=new Farmer();
		Farmer f2=new Farmer();
		Farmer f3=new Farmer();
		
		f1.compute();
		f1.interest();
		
		f2.compute();
		f2.interest();
		
		f3.compute();
		f3.interest();
	}
}
