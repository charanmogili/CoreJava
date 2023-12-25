import java.util.ArrayDeque;

public class ArrayDQ {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(11);
		ad.add(55);
		ad.add(3);
		ad.add(44);
		ad.add("charan");
//		ad.add(null);		//
		
		System.out.println(ad);
		ad.addFirst(0);
		ad.addLast(55);
		System.out.println(ad);
		Object[] array = ad.toArray();
		System.out.println(array);
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
