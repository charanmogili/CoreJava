import java.util.Scanner;

class Alpha{
	public void alpha1() throws ArithmeticException{
	Scanner scan=new Scanner(System.in);
	int res = 0;
	try {
	System.out.println("Enter the number numerator");
	int numerator=scan.nextInt();
	
	System.out.println("Enter the number denomerator");
	int denominator=scan.nextInt();
	
	res=numerator/denominator;
	System.out.println(res);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception handled in Alpha method");
		throw e;//Re-throwing exception to the caller method even though it is handled 
	}
	finally {
	System.out.println("Connection terminated");
	}
	}
}

class Beta{
	public void beta1() throws ArithmeticException{
		Alpha a=new Alpha();
		try {
		a.alpha1();
		}
		catch(ArithmeticException ae) {
			System.out.println("Inside Beta Method");
			System.out.println(ae.getMessage());
			
			throw ae;
		}
	}
}

public class ThrowsKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		try {
		Beta b=new Beta();
		b.beta1();
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception handled in main method");
		}
	}
}
