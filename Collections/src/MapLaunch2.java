import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student1{
	private String name;
	private int age;
	private String city;
	
	
	public Student1(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCity() {
		return city;
	}
	
}


public class MapLaunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1=new Student1("Swathi",24,"Hyd");
		Student1 s2=new Student1("Sravya",23,"Bengaluru");
		Student1 s3=new Student1("Sahithi",22,"Goa");

		HashMap hm=new HashMap();
		hm.put(1, s1);
		hm.put(2, s2);
		hm.put(3, s3);
		System.out.println(hm);
		System.out.println("********************************");
		
		Set s=hm.entrySet();
		Iterator itr1=s.iterator();
		while(itr1.hasNext()) {
			Map.Entry m=(Entry) itr1.next();
			System.out.println(m.getKey()+":"+m.getValue());
		}
		
		Collection c=hm.values();
		Iterator itr2=c.iterator();
		while(itr2.hasNext()) {
			System.out.println("Values->"+itr2.next());
		}
		
		Set set=hm.keySet();
		Iterator itr4=set.iterator();
		while(itr4.hasNext()) {
			System.out.print("Key :"+itr4.next());
		}
	}

}
