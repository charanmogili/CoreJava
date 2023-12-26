import java.util.Arrays;

public class Panagram {

	public static void main(String[] args) {
		boolean res=false;
		
		String s1="a quick brown fox jumps over the lazy dog";
		s1 = s1.toUpperCase();
		s1 = s1.replace(" ", "");
		System.out.println(s1);
		char[] ch1 = s1.toCharArray();
//		Arrays.sort(ch1);
//		System.out.println(ch1);
		int [] arr=new int[26];
		
		for(int i=0;i<ch1.length;i++) {
			int index=ch1[i]-65;
			arr[index]++;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.println("It is not a Panagram");
				res=true;
			}
		}
		
		if(res==false) {
			System.out.println("It is a Panagram");
		}
	}

}
