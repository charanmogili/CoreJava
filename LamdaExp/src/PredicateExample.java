import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> predicate=i->i%2==0;
		Predicate<String> predicateString=name->name.length()>3;
		
		System.out.println(predicate.test(9));
		System.out.println(predicate.test(10));
		System.out.println("///////////////////////");
		System.out.println(predicateString.test("Charan"));
		System.out.println(predicateString.test("lee"));
		
	}

}
