import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo001 {

	public static void main(String[] args) {

		ArrayList<String> ar=new ArrayList<String>();
		ar.add("kapil");
		ar.add("amarnath");
		ar.add("sindhu");
		ar.add("richards");
		ar.add("sunil");
		
		List<String> list = ar.stream().filter(i->i.length()>5)
				                       .map(l->l.toUpperCase())
				                       .collect(Collectors.toList());
		list.forEach(n->System.out.println(n));
		System.out.println(list);
		
		long count = ar.stream().count();
		System.out.println(count);
	}

}
