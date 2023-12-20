package ComparingElements;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparato implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String) o1;
		String s2=(String) o2;
		
//		return s1.compareTo(s2); Alphabetical Order
		return s2.compareTo(s1);
	}
	
}
public class ReverseAlphOrder {

	public static void main(String[] args) {

		Set<String> ts = new TreeSet<String>(new MyComparato());
		ts.add("charan");
		ts.add("abhi");
		ts.add("alirajpet");
		ts.add("vizag");
		ts.add("hari");
		
		System.out.println(ts);
		
	}
}
