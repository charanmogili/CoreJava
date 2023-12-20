import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetLaunch1 {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add(50);
		hs.add(125);
		hs.add(99);
		hs.add(170);
		hs.add(201);
		hs.add(50);
		System.out.println(hs);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add(50);
		lhs.add(125);
		lhs.add(99);
		lhs.add(170);
		lhs.add(201);
		lhs.add(50);
		System.out.println(lhs);
	}

}
