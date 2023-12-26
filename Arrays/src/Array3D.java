import java.util.Scanner;

//3D Regular Array
public class Array3D {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int[][][] ar=new int[2][3][3];
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.println("Enter CollageID: "+i+" Enter the StudentID "+j+" Enter the Marks of the Student "+k);
					ar[i][j][k]=scan.nextInt();
				}
			}
		}
		
		System.out.println(ar[0][1][2]);
		System.out.println("Marks of the Students are:");
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				for(int k=0;k<ar[i][j].length;k++) {
					System.out.print(ar[i][j][k]+" ");	
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
