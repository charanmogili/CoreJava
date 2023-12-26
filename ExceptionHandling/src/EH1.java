import java.util.Scanner;

public class EH1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter the number be numerator");
			Scanner scan=new Scanner(System.in);
			int n1=scan.nextInt();
			System.out.println("Enter the denominator");
			int n2=scan.nextInt();
			int res=n1/n2;
			
			System.out.println("result is :"+res);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("connection terminated inside ArithmeticException");
		}
		catch(IllegalArgumentException e) {
			System.out.println("connection terminated inside IllegalArgumentException");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("connection terminated inside Exception");
		}
		System.out.println("after try-catch");
	}

}
