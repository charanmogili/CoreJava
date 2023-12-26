import java.util.ArrayList;
import java.util.function.Consumer;

//public void forEach(Consumer<? super E> action)
//forEach accepts Consumer as an input argument
class MyConsumer implements Consumer<Integer>{
	@Override
	public void accept(Integer name) {

		System.out.println("accept method got called...");
		System.out.println(name);
	}
}
public class ConsumerInterface {

	public static void main(String[] args) {
		ArrayList<Integer> names = new ArrayList();
		names.add(2);
		names.add(4);
		names.add(9);
		names.add(1);
		
		//Traditional approach
		Consumer<Integer> consumer = new MyConsumer();
		names.forEach(consumer);
		System.out.println();
		
		//lambda expression
		names.forEach(n->System.out.println(n));
		System.out.println();
		
		//method referencing
		names.forEach(System.out::println);
	}
}