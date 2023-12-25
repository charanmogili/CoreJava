import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastFailSafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList ar=new ArrayList();
//		ar.add(20);
//		ar.add(40);
//		ar.add(60);
//		ar.add(70);
//		ar.add(80);
		
//		for(int i=1;i<ar.size();i++) {
//			System.out.println(ar.get(i));
//			 ar.add(5);
//		}
//loop will run for infinite time if we performing structural modification		
		
		
//		for (Object object : ar) {
//			System.out.println(object);
//			ar.add(5);
//		}

//		Iterator itr=ar.iterator();
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			ar.add(5);
//		}
		
		//FailSafe
		CopyOnWriteArrayList copy=new CopyOnWriteArrayList<>();
		
		copy.add(1000);
		copy.add(2000);
		copy.add(3000);
		copy.add(4000);
		
		System.out.println(copy.getClass());
		
		Iterator it=copy.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			copy.add(5);
		}
	}
}
