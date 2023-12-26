
public class CodeSnippet {

	
	  public static void main(String[] args)
	  { 
			/*
			 * int x=0; do { x++; System.out.print(x); if(++x<5) continue; ++x;
			 * System.out.print(x); } while(++x<10);
			 */
	  
		//  String s1=null;
		//  String s2= s1+"null";
		//  System.out.println(s2);
		  
		  String s1="charan";
		  System.out.println(new String("Dhoni"));
		  System.out.println(s1);
		  
		  int [][] a=new int[2][];
		  a[0]=new int[2]; //here outer array size is given that is 0th loc has 2 elements so if we r trying to
		                   //access that elements it returns 0
		  System.out.println(a[0]); 
		  System.out.println(a[1]);//here we r trying to access 1th location where size is not specified so it
		                           //return null
		  System.out.println(a[0][0]);
		  System.out.println(a[1][0]);
		  System.out.println(a[0][0]);
		  
		  System.out.println(a);
		  
	  }
}
