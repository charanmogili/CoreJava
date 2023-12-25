import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

	public static void main(String[] args) {

		List<String> nameList=new ArrayList<String>();
		nameList.add("Charan");
		nameList.add("Shanthi");
		nameList.add("Babu");
		nameList.add("Ashfaq");
		nameList.add("Ram");
		
		long count = nameList.stream().filter(name->name.length()>4).count();
		System.out.println(count);
		
		List<String> filteredList = nameList.stream().filter(name->name.length()>4)
				                                     .map(elem->elem.toUpperCase())
				                                     .collect(Collectors.toList());
		System.out.println(filteredList);
		filteredList.forEach(System.out::println);
		
//		Stream<String> list=nameList.stream().filter(name->name.length()>4);
//		list.forEach(System.out::println);
	}

}
