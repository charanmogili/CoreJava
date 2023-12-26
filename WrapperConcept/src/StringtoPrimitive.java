
public class StringtoPrimitive {

	public static void main(String[] args) {
		//String to primitive convertion
		int i1=Integer.parseInt(args[0]);
		int i2=Integer.parseInt(args[1]);
		
		System.out.println(i1+i2);
		
		
		int i=Integer.parseInt("10");
		System.out.println(i);
		
		boolean b=Boolean.parseBoolean("charan");
		System.out.println(b);
		
		double d=Double.parseDouble("12.4");
		System.out.println(d);	
		
		//char c=Character.parseChar();
		//for char parseXXX is not available
	}
}
