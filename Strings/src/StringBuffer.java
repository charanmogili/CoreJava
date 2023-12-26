
public class StringBuffer {

	public StringBuffer(String string) {
		// TODO Auto-generated constructor stub
	}

	public StringBuffer() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	    final StringBuilder s1=new StringBuilder("Charan");
		StringBuilder s2 = s1.append("Reddy");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		StringBuilder s3 = s1.append("Mogili");
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s2==s3);
		
		
		// s1=new StringBuilder("Mogili");
		//when we use final keyword immutability of String remains but 
		//same reference cannot point to another object
		
		StringBuilder s4=new StringBuilder("Harshitha");
		s4.insert(2, "ZXY");
	
		System.out.println(s4);
		
		s4.delete(2, 5);
		System.out.println(s4);
		
		s4.deleteCharAt(7);
		System.out.println(s4);
		
		
		StringBuilder s5=new StringBuilder("Kohli");
		System.out.println(s5.reverse());
		System.out.println(s5.reverse());
		s5.setCharAt(2, 'H');
		System.out.println(s5);
		
		
		
		String s6=new String("ViratKohli");
		System.out.println(s6.charAt(0));
		///////////////////////////////////////////////////
		StringBuilder sb1=new StringBuilder();
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		
		sb1.append("abcdefghijklmnopqrstuvwxyz12345678910");
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());//new capacity =(oldcap+1)*2
		
		StringBuilder sb2=new StringBuilder("Charan");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
	//////////////////////////////////////////////////////////////////
	//StringBuilder overloaded methods
	
	StringBuilder sb4=new StringBuilder();
	sb4.append("name ");
	sb4.append('G');
	sb4.append( 3.123+" ");
	sb4.append(80l+" ");
	sb4.append(true+" ");
	System.out.println(sb4);
	sb4.append(sb2);
	System.out.println(sb4);
	//////////////////////////////////////////////
	
	StringBuilder sb5=new StringBuilder("0123456789");
	sb5.insert(3, true);
	sb5.insert(9, s5);
	System.out.println(sb5);
	sb5.insert(sb5.length(), "reddy");
	System.out.println(sb5);
	
	
	StringBuilder sb6=new StringBuilder(100);
	System.out.println(sb6.append("charan"));
	System.out.println(sb6.capacity());
	
	sb6.trimToSize();
	System.out.println(sb6);
	System.out.println(sb6.capacity());
	//////////////////////////////////////////
	
	StringBuilder sbd1=new StringBuilder("charan");
	Integer i=20;
    sbd1.append(i);
    System.out.println(sbd1);
	
}
}


