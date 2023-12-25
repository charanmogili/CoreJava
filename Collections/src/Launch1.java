import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Launch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet();
		ts.add("60");
		ts.add("70");
		ts.add("99");
		ts.add("50");
		
		System.out.println(ts);
		
		ArrayList ar=new ArrayList();
		ar.add("99");
		ar.add("20");
		ar.add("40");
		ar.add("15");
		
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("charan");
		ar2.add("zharan");
		ar2.add("yharan");
		ar2.add("aharan");
		
		Collections.sort(ar2);
		System.out.println(ar2);
		
		
		ArrayList ar3=new ArrayList();
		ar3.add(10);
		ar3.add(20);
		ar3.add(40);
		ar3.add(40);
		ar3.add(50);
		
		Collections.sort(ar3);
		System.out.println(ar3);
		Integer i=Collections.binarySearch(ar3, 50);
		System.out.println(i);
		
		Collections.shuffle(ar3);
		System.out.println(ar3);
		
		int i1=Collections.frequency(ar3,40);
		System.out.println(i1);
			
	}
}
