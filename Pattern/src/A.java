
public class A {
	public static void main(String[] args) {
		int n=8;
		for(int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if((j==0 && i!=0)|| (i==0 && j<(3*n)/4 && j>0) ||(i==(n-1)/2 && j<(3*n)/4) ||(j==(3*n)/4 && i!=0)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
