import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class AccesingInfoFromCollection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);  //al.add(new Integer(10)); AUTOBOXING
		al.add(10.5);
		al.add('c');
		al.add(5f);
		al.add("charan");
		System.out.println(al);
		System.out.println("size"+al.size());
		for (Object object : al) {
			System.out.println(object);
		}
		System.out.println("************************************");
		//Iterator
		Iterator itr=al.iterator();
//		if(itr.hasNext()) {
//		       System.out.println(itr.next());
//		} 
	
		while(itr.hasNext()) {
			// Integer i=(Integer) itr.next();
	    	//Object o=itr.next();
			System.out.println(itr.next());
		}
		System.out.println("************************************");
		//in reverse direction
		//list iterator is only available for ArrayList and Liinkedlist
		ListIterator litr=al.listIterator(al.size());
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		System.out.println("************************************");
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.add(40);
		Iterator it=ad.iterator();
		
		while(it.hasNext()==true) {
			Integer i=(Integer) it.next();
			System.out.println("Array De"+i);
		}
		
		LinkedList ll=new LinkedList();
		ll.addAll(ad);
		System.out.println(ll);
		
		ListIterator litr2=ll.listIterator(ll.size());
		while(litr2.hasPrevious()) {
			Integer i=(Integer) litr2.previous();
			System.out.print(i+" ");
		}
		System.out.println("*************************************");
		//Linkedlist,ArrayDeque and TreeSet
		TreeSet add=new TreeSet();
		add.add(100);
		add.add(10);
		add.add(20);
		add.add(30);
		add.add(40);
		Iterator ditr=add.descendingIterator();
		while(ditr.hasNext()) {
			Integer i=(Integer) ditr.next();
			System.out.println(i);
		}
	}

}
