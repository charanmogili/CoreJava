
class Sample{
	private String s;
	Sample(String s){
		this.s=s;
		System.out.println("Contructor Referencing...."+s);
	}
}

interface Intrfce{
	public Sample get(String s);
}

public class ConstructorReferencing {

	public static void main(String[] args) {

		Intrfce i1=s->new Sample(s);
		
		i1.get("from lambda exp");
		
		Intrfce i2=Sample::new;
		i2.get("From constructor referencing");
		
	}

}
