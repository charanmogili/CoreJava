import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetLaunch1 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
//		ts.add(101);
//		ts.add(12000);
//		ts.add(16);
//		ts.add(170);
//		ts.add(400);
//		ts.add(400);
//		ts.add(99);
//		ts.add("charan");
//		System.out.println(ts);
//	    System.out.println(ts.ceiling(101));//nearest higher value
//	    System.out.println(ts.higher(101));
//	    System.out.println(ts.lower(101));
//	    System.out.println(ts.floor(101));
//	    
//	    System.out.println("***************************************");
//	    System.out.println(ts.ceiling(150));
//	    System.out.println(ts.higher(150));
//	    System.out.println(ts.lower(150));
//	    System.out.println(ts.floor(150));
		
		ts.add("charan");
		ts.add("adithi");
		ts.add("zarena");
		System.out.println(ts);
		
		Iterator<String> itr=ts.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			
		}
		
		int a=10;
		Integer b=1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(b.equals(10));
	}

}
