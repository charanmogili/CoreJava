import java.util.LinkedList;

public class LinkedListLaunch1 {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(10);
		l1.add("charan");
		l1.add('Z');
		l1.add(10);
		l1.add(33);
		l1.add(44);
		l1.add(44);
		l1.add(55);
		l1.add(44);
		
		System.out.println(l1);
		System.out.println(l1.contains(9));
		int index=l1.indexOf(33);
		System.out.println(index);
		
		System.out.println(l1.isEmpty());
		System.out.println(l1.size());
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getClass());
		System.out.println(l1.indexOf(44));
		System.out.println(l1.lastIndexOf(44));
		l1.offerFirst(00);
		l1.offerLast(66);
		System.out.println(l1);
		l1.addFirst(11);
		l1.addLast(99);
		System.out.println(l1);
		System.out.println(l1.peekFirst());
		System.out.println(l1);
		System.out.println(l1.pollFirst());
	}
}
