
public class Iterations {

	public static void main(String[] args) {
		
		//3D for-Each
		
		  int [][][] ar={{{10,20},{30,40,50}},{{40,50},{60,70}}};
		  
		  for(int[][] a:ar) { 
		       for(int[] b:a) { 
		              for(int c:b) { 
		                         System.out.print(c+" ");
		                      } 
		 System.out.println();
		  } 
		       System.out.println(); 
		  }
		 
		
		
		/*
		 * //2D for-Each int [][] arr= {{1,2},{2,3,6},{4,5,7}};
		 * 
		 * for(int[] a:arr) { 
		 *            for(int b:a) { 
		 *                      System.out.print(b+" "); 
		 *                      }
		 *            System.out.println(); 
		 *            }
		 */
	}

}
