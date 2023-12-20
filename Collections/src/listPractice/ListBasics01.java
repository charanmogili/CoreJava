package listPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ListBasics01 {

	public static void main(String[] args) {

		ArrayList<String> alist=new ArrayList<String>();
		alist.add("charan");
		alist.add("sahithi");
		alist.add("deepika");
		alist.add("shruthi");
		alist.add("priya");
		
		System.out.println(alist);
		Iterator<String> itr1=alist.iterator();
		while(itr1.hasNext()) {
			String next = itr1.next();
			System.out.println(next);
		}
		System.out.println("************");
		alist.remove(1);
		itr1=alist.iterator();
		while (itr1.hasNext()) {
			String string = itr1.next();
			System.out.print(string);
			if(itr1.hasNext())
				System.out.print(",");
		}
	}

}
