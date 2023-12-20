import java.util.ArrayList;

class Student{
	private int id;
	private String name;
	private int score;
	
	
	public Student(int id, String name, int score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
	}
	
}

public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"charan",99);
		Student s2=new Student(2,"meghana",80);
		Student s3=new Student(3,"ravali",75);
		
		ArrayList<Student> ar=new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
	}
}
