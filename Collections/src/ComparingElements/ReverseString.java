package ComparingElements;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {

		String s1=(String) o1;
		String s2=o2.toString();
		
		return s2.compareTo(s1);
//		return s1.compareTo(s2);
//		return -1;
//		return 1;
//		return 0;
	}
	
}
class ReverseString {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new MyComparator());
		ts.add("Shanti");
		ts.add("Babu");
		ts.add("Hari");
		ts.add("Sree Ram");
		ts.add("Kalyan");
		
		System.out.println(ts);
	}

}
