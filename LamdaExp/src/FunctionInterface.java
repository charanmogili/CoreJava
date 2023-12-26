import java.util.function.Function;

//When to go for Predicate and When to go for Function?
//Predicate -> To implement some conditional checks we should go for Predicate
//Function -> To perform some operation and to return some result we should go for Function.

class MyFunction implements Function<String, Integer>{

	@Override
	public Integer apply(String name) {
		// TODO Auto-generated method stub
		return name.length();
	}
	
}
public class FunctionInterface {

	public static void main(String[] args) {

		Function<String, Integer> f=name->name.length();
		Integer length = f.apply("charan");
		System.out.println(length);
	}

}
