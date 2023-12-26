import java.util.Arrays;

public class GreatestNo {

	public static void main(String[] args) {
		int[] ar= {3,6,1,2,8,5};
		int max=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("Greatest of all "+max);
		Arrays.sort(ar);
		for (int i : ar) {
			System.out.print(i+" ");
		}
	}
}
