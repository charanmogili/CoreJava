import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,8,3,13,11};
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("//Sum of Elements");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("The sum is "+sum);
		
		System.out.println("Minimum element in an Array");
		int[] a1= {10,90,56,101,8,10,90};
		int min=a1[0],max=a1[0];
		
		for(int i=1;i<a1.length;i++) {
			if(min>=a1[i]) 
				min=a1[i];
		}
		System.out.println("Minimum element is "+min);
		
		for(int i=1;i<a1.length;i++) {
			if(max<=a1[i])
				max=a1[i];
		}
		System.out.println("Maximum element is "+max);
		
		Arrays.sort(a1);
		int length=a1.length-1;
		System.out.println("Min "+a1[0]);
		System.out.println("Max "+a1[length]);
		
		int [] a2= {10,20,40,60,50,8,15};
	    Arrays.sort(a2);
		System.out.println("/////////////////////");
		int binarySearch = Arrays.binarySearch(a2, 15);
		System.out.println(binarySearch);
		for (int i : a2) {
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.fill(a2, 3, 6, 0);
		for (int i : a2) {
			System.out.print(i+" ");
		}
	}
}
