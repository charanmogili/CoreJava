
public class Practice {

	public static void main(String[] args) {
		String s1="sania";
		String s2=new String("mirza");
		String s3="reddy";
		System.out.println(s3);
		s3="charan";
		System.out.println(s3);
		String concat = s1.concat(" mirza");
		System.out.println(concat);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);

		StringBuilder sb1=new StringBuilder(concat);
		sb1.append(" saina");
		System.out.println(sb1);
		
		String str=" ";
		String trim = str.trim();
		System.out.println(trim.isBlank());		
	}
}
