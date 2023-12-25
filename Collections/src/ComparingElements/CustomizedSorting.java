package ComparingElements;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Studentt implements Comparable{
	
	Integer id;
	String name;
	
	public Studentt(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Studentt [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		
		Integer id1 = this.id;
		Studentt e=(Studentt) o;
		int id2 = e.id;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else 
			return 0;
	}
}

class CustomComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Studentt s1=(Studentt) o1;
		Studentt s2=(Studentt) o2;
		
		String n1 = s1.name;
		String n2 = s2.name;
	
		return n1.compareTo(n2);
	}
	
}

public class CustomizedSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentt emp1=new Studentt(1, "sachin");
		Studentt emp2=new Studentt(3, "virat");
		Studentt emp3=new Studentt(2, "rohit");
		Studentt emp4=new Studentt(4, "gambhir");
		
		TreeSet<Studentt> ts=new TreeSet<Studentt>();
		ts.add(emp4);
		ts.add(emp3);
		ts.add(emp2);
		ts.add(emp1);
		
		System.out.println(ts);
//		Iterator<Studentt> itr = ts.iterator();
//		if(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		TreeSet<Studentt> ts2=new TreeSet<Studentt>(new CustomComparator());
		ts2.add(emp4);
		ts2.add(emp3);
		ts2.add(emp2);
		ts2.add(emp1);
		
		System.out.println(ts2);
	}
}
