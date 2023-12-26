
public class StringCreation {

	public static void main(String[] args) {
		String s1="charan";
		String s2=new String("charan");
		System.out.println(s2);
		System.out.println(s1);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		StringBuilder s3=new StringBuilder("Swetha");
		StringBuilder s4=new StringBuilder("Swetha");
		//s3.append("reddy");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s1));
        System.out.println(s3.equals(s2));
	}

}
