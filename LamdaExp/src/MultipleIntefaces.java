
interface Demoo1{
	public void car();
	
}

interface Demo2 {
	public void bike();
}

public class MultipleIntefaces {

	public static void main(String[] args) {

		Demoo1 d1=new Demoo1() {
			public void car() {
				System.out.println("Inside Car");
			}
		};
		
		Demo2 d2=new Demo2() {
			public void bike() {
				System.out.println("Inside Bike");
			}
		};
		d1.car();
		d2.bike();	
	}
}
