import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int[] ar= {10,20,30,79,50,90,60};
		boolean flag=false;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the key");
		int key=scan.nextInt();
		
		//for(int i:ar) 
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i]) {
				System.out.println("key "+key+" Found at index "+i);
				flag=true;
				break;
			}
		}
		if(flag==false) {
		System.out.println("Key not found");
		}
	}

}
