import java.util.function.Predicate;

public class LamdiPredicatePractice02 {

	public static void main(String[] args) {

		int [] arr= {2,5,8,12,4,67,69,35,50};
		
		Predicate<Integer> p=i->i>10;
		System.out.println("Elements which are greater than 10 are");
		m1(p,arr);
		
		Predicate<Integer> multiples=j->j%2==0;
		System.out.println("Elements which are even");
		m1(multiples,arr);
		
		System.out.println("Elements greater than 10 and even");
		m1(p.and(multiples),arr);
		
		System.out.println("Elements greater than 10 or even");
		m1(p.or(multiples),arr);
		
		System.out.println("Elements which are not even");
		m1(multiples.negate(), arr);
	}

	public static void m1(Predicate<Integer> p, int[] arr) {
		for (int i : arr)  {
			if(p.test(i)) {
				System.out.println(i);
			}
		}	
	}
}
