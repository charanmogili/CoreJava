
public class EvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<=20;i++) {
			if(i%2==0) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println(count);
	}

}
