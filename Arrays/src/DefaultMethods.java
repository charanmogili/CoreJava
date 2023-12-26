import java.util.Arrays;

public class DefaultMethods {

	public static void main(String[] args) {
		int[] a=new int[4];
		
		for(int elem:a) {
			System.out.print(elem);
		}
		System.out.println();
		Arrays.fill(a,7);
		for(int elem:a) {
			System.out.print(elem);
		}
		System.out.println();
		System.out.println();
		
		/////////////////////////////////////////////
		int[] ar= {2,4,0,0,0,6,7};
		for(int elem:ar) {
			System.out.print(elem+" ");
		}
		System.out.println();
		
		Arrays.fill(ar, 2, 6, 99);
		for(int elem:ar) {
			System.out.print(elem+" ");
		}
		System.out.println();
		System.out.println();
		
		//////////////////////////////////////////////
		int[] ar2= {90,30,50,20,5,86,1};
		for(int elem1:ar2)
		{
			System.out.print(elem1+" ");
		}
		System.out.println();
		Arrays.sort(ar2);
		for(int elem1:ar2)
		{
			System.out.print(elem1+" ");
		}
		System.out.println();
		
		int res=Arrays.binarySearch(ar2, 91);
		System.out.println(res);
		}

	}


