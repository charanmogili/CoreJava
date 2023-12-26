@FunctionalInterface
interface Add{
	int add(int a,int b);
}
interface Sub{
	void sub(int c);
}
public class AddUsingLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1=(a,b)->  a+b;
		System.out.println(a1.add(5,4));
		
		Sub s1=c->System.out.println(c-6);
		s1.sub(12);
	}
}
