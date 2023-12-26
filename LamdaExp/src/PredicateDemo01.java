import java.util.function.Predicate;

public class PredicateDemo01 {

	public static void main(String[] args) {

		Predicate<Integer> p=i->i>10;
		Predicate<String> p2=i->i.length()>4;
		System.out.println(p.test(8));
		System.out.println(p.test(12));
		System.out.println(p2.test("charan"));
		System.out.println(p2.test("rohi"));
		
		int[] ar1= {1,2,3,4,5,6,7,8,12,24,14,245,677,644,34,89,65};
		Predicate<Integer> p3=i->i%2==0;
		m1(p3,ar1);
	}

	private static void m1(Predicate<Integer> p3, int[] ar1) {

		for (int i : ar1) {
			if(p3.test(i))
			System.out.print(i+" ");
		}
	}

}
