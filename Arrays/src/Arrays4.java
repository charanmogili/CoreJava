
public class Arrays4 {
	public static void main(String[] args) {
		
		  int[] ar=new int[3]; 
		  ar[0]=4; 
		  ar[1]=6; 
		  ar[2]=8;
		  System.out.println("Print after array length reached 3"); //Arrays in Java are guarded with boundaries 
//		  ar[3]=9; 
//		  System.out.println("after the length");
		 
		
		
		  int [] i=new int[] {10,40}; 
		  int [] a= {20,30,40}; 
		  int [][] b={{10,30},{60,50}}; //2D regular 
		  int [][] c= {{10,30},{50,60,15}};
		 
		
		int [] a2= {10,40,20,50};
		
		for(int e:a2) {
			System.out.print(e+" ");
		}
	}

}
