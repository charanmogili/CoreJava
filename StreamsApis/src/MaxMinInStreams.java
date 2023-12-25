import java.util.ArrayList;
import java.util.stream.Stream;

public class MaxMinInStreams {

	public static void main(String[] args) {

		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting :: "+al);
		
		Integer minNo = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(minNo);
		
		Integer maxNo = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(maxNo);
		System.out.println("................");
		Stream s=Stream.of(9,99,999,9999);
		s.forEach(System.out::println);
		
		Double[] d= {10.0,10.1,10.2,10.4};
		Stream s1=Stream.of(d);
		s1.forEach(System.out::println);
		
		
	}
}
