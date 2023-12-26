

public class LowertoUpper {

	public static void main(String[] args) {
		char ch='a';
		System.out.println(ch);
		ch=(char) (ch-32);
		System.out.println(ch);
		
		
		
		/*
		 * Scanner scan=new Scanner(System.in);
		 * System.out.println("Enter String which is to be coverted to UpperCase");
		 * String s1=scan.nextLine(); String s2="";
		 */
		  
			
			/*
			 * for(int i=0;i<s1.length();i++) 
			 * { 
			 * s2=s2+(char)(s1.charAt(i)-32);//anything concating with STRING becomes String 
			 * } 
			 * System.out.println(s2);
			 * 
			 * Scanner sc=new Scanner(System.in);
			 * System.out.println("Enter String which is to be coverted to LowerCase");
			 * String s3=sc.nextLine(); 
			 * String s4=""; 
			 * for(int i=0;i<s3.length();i++) 
			 * {
			 * s4=s4+(char)(s3.charAt(i)+32); 
			 * } 
			 * System.out.println(s4);
			 */
			 
		
		//String str=10.6+12+'c'+"c";
		//System.out.println(str);
			  
		String s4="ChArAn";
		String s5="";
		System.out.println(s4);
		
		for(int i=0;i<s4.length();i++)
		{
			if(s4.charAt(i)>='a' &s4.charAt(i)<='z')
			{
				s5=s5+(char)(s4.charAt(i)-32);
			}
			else if(s4.charAt(i)>='A' &s4.charAt(i)<='Z')
			{
				s5=s5+(char)(s4.charAt(i)+32);
			}
		}
		System.out.println(s5);
			  
		String name="IneUrOn";
		String reverse="";
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)>='A'& name.charAt(i)<='Z') {
				reverse=reverse+(char)(name.charAt(i)+32);
			}
			else if(name.charAt(i)>='a'& name.charAt(i)<='z') {
					reverse=reverse+(char)(name.charAt(i)-32);
			}
		}
		System.out.println(reverse);
	}
}
