
class Demo{
	int x=10;
	String name="kohli";
	@Override
	public String toString() {
		return "Demo [x=" + x + ", name=" + name + "]";
	}
	
	
}


public class ToStringMethod {

	public static void main(String[] args) {
		Demo d=new Demo();
		System.out.println(d);
		
		int [] ar= {1,2,3,4};
		
		for (int i : ar) {
			System.out.println(i);			
		}
		System.out.println(ar);

	}

}
