
public class StringMethods {

	public static void main(String[] args) {
		String s1="CharanREDDY";
		
		System.out.println(s1);
		System.out.println(s1.substring(6));
		System.out.println(s1.substring(3, 8));
		System.out.println(s1);
		System.out.println(s1.length());
		
		System.out.println(s1.replace('C', 'S'));
		//System.out.println(s1.replaceAll(regex, replacement));
		
		String s3=s1.toUpperCase();
		System.out.println(s3);
		System.out.println(s3==s1);
		String s4=s1.toLowerCase();
		System.out.println(s4);
		
		
		String s5="  Hyderabad City  ";
		System.out.println(s5.length());
		System.out.println(s5.trim().length());//trim method removes spaces which are at end and begining but not at the middle of the String
		System.out.println(s5.length());
//		String[] s10=s5.split(" ");
//		System.out.println(s10);
		System.out.println(s5.split(s5));
		
		String s6="Charana";
		System.out.println(s6.indexOf('a'));
		System.out.println(s6.lastIndexOf('z'));
		}
}
