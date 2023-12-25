import java.util.PriorityQueue;

public class PriorityQueLaunch {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
//		pq.add(99);
//		pq.add(12);
//		pq.add(66);
//		pq.add(77);
//		pq.add(24);
//		pq.add(6);
//		pq.add(6);
//		pq.add(1);
//		pq.add("charan");
		
		
		pq.add("charan");     //Class ClassCastException
		pq.add("aharan");
		pq.add("zharan");
		pq.add("dharan");
//		pq.add(null);		//null values not allowed in priority queue
		System.out.println(pq);
	}

}
