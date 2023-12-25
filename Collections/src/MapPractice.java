import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {

		Map<Integer, Set<Integer>> map = new HashMap();
		
		Set<Integer> set1=new LinkedHashSet<>();
		set1.add(8);
		set1.add(18);
		
		Set<Integer> set2=new HashSet<>();
		set2.add(15);
		set2.add(10);
		set2.add(12);
		
		map.put(0, set1);
		map.put(2, set2);
		System.out.println(map.get(0));
	}

}
