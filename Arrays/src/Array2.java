import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[][] ar=new int[3][4];
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.println("Enter the Marks of the Student of Class "+i+" Enter the Marks of Student"+j);
				ar[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Marks of Student");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
