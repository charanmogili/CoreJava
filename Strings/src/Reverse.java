
public class Reverse {

	public static void main(String[] args) {
		// # types of reversing 
		//  1>charan--->narahc
		//  2>charan reddy--->ydder narahc
		//  3>charan reddy--->narahc ydder
		////111111111111111111111111111111111/////
		
		String s1="Charan";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		System.out.println("Original String: "+s1);
		System.out.println("After reversing: "+s2);
		
		////2222222222222222222222222222222222/////
		//charan reddy-->ydder narahc
		String s3="Virat Kohli";
		String s4="";
		String sarr[]=s3.split(" ");
		System.out.println(sarr[1]);
		System.out.println(sarr[0]);
		
		
		/*
		 * for(int i=s3.length()-1;i>=0;i--) 
		 * { 
		 * s4=s4+s3.charAt(i); 
		 * }
		 * System.out.println(s4);
		 */
		for(int i=sarr.length-1;i>=0;i--)
		{
			for(int j=sarr[i].length()-1;j>=0;j--)
			{
				s4=s4+sarr[i].charAt(j);
			}
			s4=s4+" ";
		}
		System.out.println("Virat Kohli -->"+s4);
		
		
		////3333333333333333333333333333333333/////
		String s5="charan reddy";
		String s6="";
		String arr[]=s5.split(" ");  //Array is created placing charan at 0th index and reddy at 1th index
		System.out.println(arr[0]);
		
		for(String elem:arr)
		{
			for(int j=elem.length()-1;j>=0;j--)
			{
				s6=s6+elem.charAt(j);
			}
			s6=s6+" ";
		}	
		System.out.println("charan reddy -->"+s6);
		
		System.out.println("///Ajinkya Rahane////");
		
		String s7="Ajinkya Rahane";
		String s8="";
		String []splitS7 = s7.split(" ");
		System.out.println(splitS7.length);
		
		for(int i=splitS7.length-1;i>=0;i--) {
			s8=s8+splitS7[i]+" ";
		}
		System.out.println(s8);
	}
}
