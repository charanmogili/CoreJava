import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LaunchMap {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
        m.put(10, "Messi");
        m.put(10, "Veronica");
        m.put(18, "Virat");//Entry
        m.put(7, "Dhoni");
        m.put(7,"sachin");
        System.out.println(m+" printing hashMap");
        
        Collection c=m.values();
        Iterator itr=c.iterator();
        while(itr.hasNext()) {
        	//System.out.println(itr.next());
        	String o=(String) itr.next();
        	System.out.println(o);
        }
        
        Set s=m.keySet();
        Iterator itr2=s.iterator();
        while(itr2.hasNext()) {
        	//System.out.println(itr2.next()+" Using KeySet()");
        	Integer i=(Integer) itr2.next();
        	System.out.println(i+" Using keySet");
        }
        
        Set s2=m.entrySet();
        Iterator itr3=s2.iterator();
        while(itr3.hasNext()) {
        	//System.out.println(itr3.next());
//        	Object o=itr3.next();
//        	System.out.println("Key-Value "+o);
        	
        	Map.Entry o=(Entry) itr3.next();
        	System.out.println(o.getKey()+":"+o.getValue());
        }
        
        
        LinkedHashMap m1=new LinkedHashMap();
        m1.put(10, "Messi");
        m1.put(18, "Virat");
        m1.put(7, "Dhoni");
        System.out.println(m1);
	}
}
