
public class MinMax {

	public static void main(String[] args) {
		int[] ar= {20,70,01,60,93,79,48,-1,101};
		int max=ar[0];
		int min=ar[0];
		
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		System.out.println("max is :"+max);
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		System.out.println("min is :"+min);
	}

}
