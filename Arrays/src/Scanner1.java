import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		System.out.println("Please enter Number");
		@SuppressWarnings("resource")
		Scanner ar=new Scanner(System.in);
		int a =ar.nextInt();
		System.out.println(a);

	}

}
