
interface Intrf{
	public void m1(int i);
}

public class MethodReferencing {
    //logically already written 
	public void logicCoded(int j) {
		System.out.println("From method reference");
	}
	
	public static void main(String[] args) {
		Intrf in1=i->System.out.println("Lambda Exp "+i);
		in1.m1(12);
		
		Intrf in2=new MethodReferencing()::logicCoded;
		in2.m1(12);
	}
}
