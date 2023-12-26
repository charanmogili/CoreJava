
interface MR2{
	public void mr21(int i);
}
public class MethodReferencing2 {

	//logic coded by other developer
	public void mr22(int i) {
		System.out.println("logic coming from method reference..."+i*i);
	}
	public static void main(String[] args) {

		MR2 mr2=i->System.out.println("inside lambda reference..."+i);
		mr2.mr21(4); // inside lambda reference..."+4
		
		//method reference(binding the body of mr22() to abstract method mr21
		MR2 mr=new MethodReferencing2()::mr22;
		mr.mr21(3);  //inside mr22..."+9
		
	}

}
