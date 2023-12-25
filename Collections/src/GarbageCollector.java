import java.util.HashMap;

class Employee{
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
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public void finalize() {
		System.out.println("Inside finalize method");
	}
	
}

public class GarbageCollector {

	public static void main(String[] args) {

		Employee emp=new Employee(12,"Rohit");
		HashMap hm=new HashMap();
		hm.put(1,emp);
		System.out.println(hm);
		System.out.println(emp);
		
		emp=null;
		System.gc();
		
		System.out.println(hm);
		System.out.println(emp);
		
	}

}
