import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the size of the Array");
		 * 
		 * int size=sc.nextInt();
		 *  int[] ar=new int[size];
		 */
		
		int[] ar=new int[5];
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("Please enter marks of Student " +i);
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Marks of the Students are :");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] +" ");
		}
		
	}

}
