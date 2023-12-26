
public class XXXValueMethod {

	public static void main(String[] args) {
		@SuppressWarnings("removal")
		Integer i1=new Integer(120);
		//Wrapper to Primitive type
		System.out.println(i1.byteValue());
		System.out.println(i1.shortValue());
		System.out.println(i1.intValue());
		System.out.println(i1.longValue());
		System.out.println(i1.floatValue());
		System.out.println(i1.doubleValue());
		
		Character c=new Character('a');
		char c1=c.charValue();
		System.out.println(c1);
		
		Boolean b1=new Boolean("true");
		boolean b2=b1.booleanValue();
		System.out.println(b2);
	}

}
