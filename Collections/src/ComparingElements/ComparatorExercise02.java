package ComparingElements;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Student {
    private String name;
    private double gpa;
    
	public Student(String name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	} 
	
	
}

class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Implement comparison logic based on GPA
    	Double gpa1 = s1.getGpa();
    	Double gpa2 = s2.getGpa();
    	return gpa1.compareTo(gpa2);
    }    
}

public class ComparatorExercise02 {

	public static void main(String[] args) {

		Student std1=new Student("priya",7.80);
		Student std2=new Student("haripriya",8.80);
		Student std3=new Student("supriya",6.80);
		Student std4=new Student("priya",9.80);
		
		List<Student> lst=new LinkedList<Student>();
		lst.add(std1);
		lst.add(std2);
		lst.add(std3);
		lst.add(std4);
		Collections.sort(lst, new GpaComparator());
		
		for (Student student : lst) {
			System.out.println(student);
		}
	}
}
