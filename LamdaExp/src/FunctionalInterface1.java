import java.util.function.Predicate;

//class MyPredicate implements Predicate<String>{
//
//	@Override
//	public boolean test(String t) {
//		if(t.length()>5)
//			return true;
//		else
//			return false;
//	}
//}

public class FunctionalInterface1 {

	public static void main(String[] args) {

//		Predicate<String> p=new MyPredicate();
//		Predicate<String> p1=t->t.length()>5;
		Predicate<String> p1=t->t.length()<3;
		
		System.out.println(p1.test("charan"));
		System.out.println(p1.test("john"));
		System.out.println(p1.test("ki"));
		System.out.println(p1.test("jo"));
	}

}
