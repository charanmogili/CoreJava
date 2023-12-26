import java.util.Scanner;

public class JaggedArray3D {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] ar=new int[3][];
		try {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Enter the Marks of Student "+i+" Enter the Marks of Student"+j);
				ar[i][j]=scan.nextInt();
			}
		}
		}
		catch(Exception e) {
			System.out.println("inside catch block");
		}
		
		System.out.println("Marks of Student");
		try{for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		}
		catch(Exception exception) {
			System.out.println("Inside the printing catch block");
		}
		

	}

}
