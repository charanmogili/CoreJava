package ComparingElements;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyComparatorr implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		String name1 = e1.name;
		String name2 = e2.name;
		
		return name1.compareTo(name2);
	}
}

class Employee implements Comparable{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Object o) {

		int id1 = this.id;
		Employee emp = (Employee) o;
		int id2 = emp.id;
		
		if(id1<id2)
			return -1;
		else if(id1>id2)
			return 1;
		else
			return 0;
		
//		String n1 = this.name;
//		Employee emp=(Employee) o;
//		String n2=emp.name;		
//		
//		return -n1.compareTo(n2);
	}
}

public class ComparingUsingObjects {

	public static void main(String[] args) {

		Set treeSet = new TreeSet();
		Employee e1=new Employee(10, "sachin");
		Employee e2=new Employee(7, "dhoni");
		Employee e3=new Employee(18,"virat");
		Employee e4=new Employee(12,  "gambir");
		
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		
		System.out.println(treeSet);
		System.out.println("////////////////////////");
		
	    Set treeSet2 = new TreeSet(new MyComparatorr());
	    treeSet2.add(e1);
	    treeSet2.add(e2);
	    treeSet2.add(e3);
	    treeSet2.add(e4);
	    System.out.println(treeSet2);
	}
}
