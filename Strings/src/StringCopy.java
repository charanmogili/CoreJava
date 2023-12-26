
public class StringCopy {

	public static void main(String[] args) {
		String s1="Charan";
		String s2=new String("Reddy");
		String s3="";
		String s4="ReddyCharan";
        System.out.println(s2);
        
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s2);
		
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s3=s3+s1.charAt(i);
		}
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s2==s4);
	}

}
