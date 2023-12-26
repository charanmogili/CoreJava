import java.util.function.Function;

public class FunctionPractice01 {

	public static void main(String[] args) {

		Function<String, Integer> function=name->name.length();
		System.out.println(function.apply("charan"));
		System.out.println();
		
	}
}
