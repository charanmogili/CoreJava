
@FunctionalInterface
interface Demo{
	int disp(String name);
}

public class FunctionalInterfaces1 {

	public static void main(String[] args) {
		
//		Demo d=(a,b)->{System.out.println("Inside lamda exp");
//		int num=10;
//		
//		System.out.println(num+b);
//		};
//		d.disp(10,"charan");
		
		Demo d=n->n.length();
		int len = d.disp("charan");
		System.out.println(len);
	}
}
