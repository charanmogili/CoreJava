import java.util.function.Predicate;

public class UsingMultiplePredicates {

	public static void main(String[] args) {

		int[] ar1= {2,14,3,16,17,6};
		Predicate<Integer> p1=t->t>10;
		Predicate<Integer> p2=t->t%2==0;
		
		System.out.println("Elements greater than 10");
		checkingArray(p1,ar1);
		
		System.out.println("Even Elements from the Array");
		checkingArray(p2,ar1);
		
		System.out.println("Elements greater than 10 and Even");
		checkingArray(p1.and(p2), ar1);
		
		System.out.println("Elements greater than 10 or Even");
		checkingArray(p1.or(p2), ar1);
		
		System.out.println("Elements which are not Even");
		checkingArray(p2.negate(), ar1);
	}
	
	public static void checkingArray(Predicate<Integer> p,int[] ar) {
		for (int i : ar) {
			if(p.test(i))
				System.out.println(i);
		}
	}

}
