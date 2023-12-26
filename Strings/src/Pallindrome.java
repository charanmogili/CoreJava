
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="MADAM";
		String s2="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		
		
		  if(s1.equals(s2)) { System.out.println("String is Pallindrom"); } else {
		  System.out.println("String is not Pallindrom"); }
		 
		
//		char[] s3=s1.toCharArray();
//		char[] s4=s2.toCharArray();
//		//System.out.println(s3[3]);
//		//System.out.println(s4);
//		boolean flag=false;
//		
//		for(int i=0;i<s3.length;i++)
//		{
//			if(s3[i]==s4[i])
//			{
//				flag=true;
//			}
//			else
//			{
//				flag=false;
//				break;
//			}
//		}
//		if(flag==true)
//		{
//			System.out.println(s1+" is a Pallindrome");
//		}
//		else
//		{
//			System.out.println(s1+" is not a Pallindrome");
//		}
	}

}
