import java.util.function.Predicate;

class MyPredicate implements Predicate<String>{

	@Override
	public boolean test(String name) {
		if(name.length()>3) {
			return true;
		}
		else
			return false;
	}
}

public class MyPredicateTest {

	public static void main(String[] args) {
//		MyPredicate p=new MyPredicate();
		Predicate<String> p=n->n.length()>3;
		System.out.println(p.test("charan"));
		System.out.println(p.test("lee"));	
	}
}
