package ComparingElements;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    // Constructor, getters, and setters
    public Person(String name, int age) {
    	super();
    	this.name = name;
    	this.age = age;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person other) {
		
		// Implement comparison logic based on age
		Integer a1 = this.age;
		Integer a2=other.age;
		
		return a1.compareTo(a2);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


public class ComparableExercise01 {

	public static void main(String[] args) {

		Person p1=new Person("charan",25);
		Person p2=new Person("nikhil",24);
		Person p3=new Person("abhi",22);
		List<Person> list=new LinkedList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Collections.sort(list);
		
		for (Person p : list) {
			System.out.println(p);
		}	
	}
}
