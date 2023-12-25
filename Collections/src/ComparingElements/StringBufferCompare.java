package ComparingElements;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator2 implements Comparator{

//	If we are Depending on Default Natural Sorting Order Compulsory Objects should be 
//	Homogeneous and Comparable. 
//	Otherwise we will get RE: ClassCastException.
//	An object is said to be Comparable if and only if corresponding class implements 
//	Comparable interface.
//	All Wrapper Classes, String Class Already Implements Comparable Interface. But 
//	StringBuffer Class doesn't Implement Comparable Interface.
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
		
		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		else
			return s2.compareTo(s1);
	}
}
class StringBufferCompare {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new MyComparator2());
		ts.add(new StringBuffer("Shanti"));
		ts.add(new StringBuffer("Babu"));
		ts.add(new StringBuffer("Hari"));
		ts.add(new StringBuffer("Sree Ram"));
		ts.add(new StringBuffer("Kalyan"));
		
		System.out.println(ts);
	}

}
