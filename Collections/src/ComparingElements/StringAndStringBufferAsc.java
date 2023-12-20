package ComparingElements;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		String s1=o1.toString();
		String s2=o2.toString();
		
		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return 1;
		else
			return s1.compareTo(s2);
			
	}
}
public class StringAndStringBufferAsc {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new MyComparator3());
		ts.add("Shanti");
		ts.add(new StringBuffer("Babu"));
		ts.add("Hari");
		ts.add(new StringBuffer("Sree Ram"));
		ts.add("Kalyan");
		
		System.out.println(ts);
	}

}
