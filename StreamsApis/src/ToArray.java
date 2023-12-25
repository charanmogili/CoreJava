import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {

		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Array List is ::"+al);
		
		Integer[] ar = al.stream().toArray(Integer[]::new);
		for (Integer i : ar) {
			System.out.println(i);
		}
	}
}
