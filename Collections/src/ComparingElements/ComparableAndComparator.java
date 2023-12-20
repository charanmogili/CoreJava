package ComparingElements;

import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

class Player implements Comparable{
	int id;
	String name;
	
	public Player(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		int id1=this.id;
		Player e=(Player) o;
		int id2=e.id;
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return +1;
		else
			return 0;
	}
}

class MyComparator4 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Player e1=(Player) o1;
		Player e2=(Player) o2;
		String s1=e1.name;
		String s2=e2.name;
		return s2.compareTo(s1);
	}
}
public class ComparableAndComparator {

	public static void main(String[] args) throws IOException {

		Player e1 = new Player(10,"sachin");
		Player e2 = new Player(14,"ponting");
		Player e3 = new Player(9,"lara");
		Player e4 = new Player(17,"flintoff");
		Player e5 = new Player(23,"anwar");
		
		TreeSet t1=new TreeSet();
		t1.add(e1);
		t1.add(e2);
		t1.add(e3);
		t1.add(e4);
		t1.add(e5);
		System.out.println("Player "+t1);
		
		System.in.read();
		TreeSet t2=new TreeSet(new MyComparator4());
        t2.add(e1);
		t2.add(e2);
		t2.add(e3);
		t2.add(e4);
		t2.add(e5);
		System.out.println(t2);
	}
}
