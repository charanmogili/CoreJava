import java.util.function.Function;

public class FunctionDemo001 {

	public static void main(String[] args) {

		Function<String,Integer> f1=(i)->i.length();
		System.out.println(f1.apply("charan"));
		System.out.println(f1.apply("sachin"));
		System.out.println(f1.apply("gambhir"));
	}

}
