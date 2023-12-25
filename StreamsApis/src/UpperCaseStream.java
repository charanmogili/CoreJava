import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseStream {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("sachinn");
		names.add("saurav");
		names.add("dhoni");
		names.add("dravid");
		names.add("kohli");
		names.add("raina");
		System.out.println(names);
		
		List<String> upperCaseElemList = names.stream().map(name->name.toUpperCase())
		                                      .collect(Collectors.toList());
		System.out.println(upperCaseElemList);
		
		upperCaseElemList.forEach(System.out::println);

		System.out.println(".........................");
		long count = names.stream().filter(n->n.length()>6).count();
		System.out.println(count);
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println("Before sorting :: "+al);
		
		List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> sortedListUsingComparator = al.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		sortedListUsingComparator.forEach(System.out::println);
		
	}

}
