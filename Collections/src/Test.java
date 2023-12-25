import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Customer {
	private String custName;

	
	public Customer(String custName) {
		super();
		this.custName = custName;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	@Override
	public String toString() {
		return custName;
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate l=LocalDate.of(2012, 5, 12);
		System.out.println(l);
		l.plusMonths(3);
		l.plusDays(2);
		l.plusYears(3);
		System.out.println(l);
		boolean equals = l.getDayOfWeek().equals(DayOfWeek.FRIDAY);
		System.out.println(equals);
		// [A-Za-z]+( [A-Za-z]+)*
		Integer intake=1921;
		if(intake< LocalDate.now().getYear())
			System.out.println("true");;
			//[a-zA-Z\s]+
		if(intake>LocalDate.now().getYear() || intake<(LocalDate.now().getYear()-100))
			System.out.println("inside");
		
		Customer c1=new Customer("John");
		Customer c2=new Customer("Joe");
		Customer c3=new Customer("Sam");
		
		List<Customer> list=new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		System.out.println("Before: "+list);
		for(int j=0;j<list.size();j++)
		{
			Customer e=list.get(j);
			if(e.getCustName().equals(c1.getCustName())){
				list.remove(j+1);
			}
		}
		System.out.println("After "+list);
		
		DayOfWeek d=DayOfWeek.of(7);
		System.out.println(d);
		
		
		Map map=new TreeMap();
		map.put("Spring", 10);
		map.put("Java", 20);
		map.put("spring", 20);
		map.put("Java", 50);
		System.out.println(map);
		
		
	}

}
