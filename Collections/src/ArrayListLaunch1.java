import java.util.ArrayList;

public class ArrayListLaunch1 {

	public static void main(String[] args) {
		ArrayList al1=new ArrayList<>();
		al1.add(10);
		al1.add("AWS");
		al1.add('S');
		
		ArrayList al2=new ArrayList<>();
		al2.add(60);
		al2.add(20);
		al2.add(10);
		
		ArrayList al3=new ArrayList<>();
//		al3.addAll(al1);
//		al2.addAll(al3);
		al2.addAll(al1);
		//System.out.println(al3);
		System.out.println(al2);
		
		ArrayList al4=new ArrayList<>();
		al4.add(60);
		al4.add(20);
		al4.add(10);
		
		al4.add(0, 11);
		System.out.println(al4);
		al4.add(2, 22);
		System.out.println(al4);
		al4.add(5, 55);
		System.out.println(al4);
		
		al4.ensureCapacity(2);
		System.out.println(al4.size());
		al4.trimToSize();
		System.out.println(al4.getClass());
		
		al4.clear();
		System.out.println(al4.size());
	}
}
