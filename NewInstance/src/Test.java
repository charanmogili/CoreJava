class Student1{
	static {
		System.out.println("Inside the static block");
	}
	public Student1(){
		System.out.println("Inside student constructor");
	}
}

public class Test {
static {
	System.out.println("Inside Main static block");
}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		System.out.println("inside main");
//		String className =args[0];
//		Class c=Class.forName(className);
//		Object obj=c.newInstance();
		
		Object obj=Class.forName(args[0]).newInstance();
		
		Student1 std=(Student1) obj;
		System.out.println(std);
	}

}
