
public class Ineuron {
	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i==0 && j<n) ||
						(i==n-1 && j<n) ||
						(j==n/2 && i<n))  {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j=0;j<n;j++) {
				if((j==0 && i<=n-1) ||
						(j==n-1 && i<=n-1) ||
						(i==j)){
					System.out.print("N");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for (int j=0;j<n;j++) {
				if((i==0 && j<=(3*n)/4) ||
						(i==n-1 && j<=(3*n)/4) ||
						(j==0 && i<n-1) ||
						(i==n/2 && j<=(3*n)/4)){
					System.out.print("E");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for (int j=0;j<n;j++) {
				if((j==0 && i<n-1) ||
						(i==n-1 && j<n-1) ||
						(j==n-1 && i<=n-1)){
					System.out.print("U");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("   ");
			for (int j=0;j<n;j++) {
				if((i==0 && j<=(3*n)/4) ||
						(i==n/2 && j<=(3*n)/4) ||
						(j==0 && i<n) ||
						(j==(3*n)/4 && i<n/2) ||
						 (j==n/2 && i==(3*n)/4) ||
						 (j==(3*n)/4 && i==n-2) 
						 
						
						) {
					System.out.print("R");
				}
				else{
					System.out.print(" ");
				}
			}
			for (int j=0;j<n;j++) {
				if((i==0 && j<n) ||
						(i==n-1 && j<n) ||
						(j==0 && i<n) ||
					    (j==n-1 && i<n)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			for (int j=0;j<n;j++) {
				if((j==0 && i<=n-1) ||
						(j==n-1 && i<=n-1) ||
						(i==j)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}}
