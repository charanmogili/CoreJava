
public class StringCopy2 {

	public static void main(String[] args) {
		String s1="kohli";
		String s2="";
		String s3="";
		
		for(int i=0;i<s1.length();i++) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		for(int i=s1.length()-1;i>=0;i--) {
			s3=s3+s1.charAt(i);
		}
		System.out.println(s3);
		
		
		String name=" Virat Kohli ";
		System.out.println(name);
		System.out.println(name.length());
//		System.out.println(name.trim().length());
//		System.out.println(name.stripLeading());
		
		String surname="     mahender singh dhoni    ";
		System.out.println(surname);
		System.out.println(surname.length());
		System.out.println(surname.stripIndent());
		System.out.println(surname.length());
		
	}
}
