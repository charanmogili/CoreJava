import java.util.TreeSet;

public class ConsumerDemo001 {

	public static void main(String[] args) {

		TreeSet<String> ts=new TreeSet<String>();
		ts.add("anil");
		ts.add("kapil");
		ts.add("lee");
		ts.add("bruce");
		ts.add("rohit");
		
		ts.forEach(n->System.out.println(n));
	}

}
