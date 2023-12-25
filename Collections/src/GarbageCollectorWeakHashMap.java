import java.util.HashMap;
import java.util.WeakHashMap;

class Employ{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public Employ(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void finalize() {
		System.out.println("Inside finalize method");
	}
	
}

public class GarbageCollectorWeakHashMap {

	public static void main(String[] args) {

		Employ emp=new Employ(12,"Rohit");
		WeakHashMap whm=new WeakHashMap();
		whm.put(emp,"Kohli");
		System.out.println(whm);
		System.out.println(emp);
		
		emp=null;
		System.gc();
		
		System.out.println(whm);
		System.out.println(emp);
		
	}

}
