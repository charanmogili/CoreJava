
public class TC1 {
	public static void main(String[] args) {
		byte Float=(byte)140;
		short Long= (short)120000;
		byte Short='a';
		byte Integer='z';
		byte Byte='A';
		byte String='Z';
		
		System.out.println(Float);
		System.out.println(Long);
		System.out.println(Short);
		System.out.println(Integer);
		System.out.println(Byte);
		System.out.println(String);
	
		
		int i=1200;
		long l=12000000000l;//every literal by default get stores as int.(here the value is exceding max limit of int so we need to explicitly specify to store it in long)
		System.out.println(i);
		System.out.println(l);
		
		byte b=4;
		byte B=5;
		byte result = (byte) (b*B);
		System.out.println(result);
		System.out.println(b+B);
		
		float f=13.5f;//by default any real no./decimal no. is treated as double so we need to explicitly specify to compiler to treat it as float
		System.out.println(f);
		
		
		
		  int j=25; int k=2; float m=j/k;
		 
		
		/*
		 * float j=25; float k=2; float m=j/k;
		 */
		System.out.println(m);
		
		//Conversion of one type of data to another type of data is called Type Casting
	}

}
