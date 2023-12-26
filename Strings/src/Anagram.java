import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="elegant Man";
		String s2="a gentle Man";
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] charArray = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		System.out.println(charArray);
		System.out.println(charArray2);
		
		for(int i=0;i<charArray.length;i++) {
			for(int j=0;j<charArray2.length;j++) {
				if(charArray[i]==charArray2[j])
					System.out.println(charArray[i]+" is found at "+j);
				
			}
		}
		
//		Arrays.sort(charArray);
//		Arrays.sort(charArray2);
//		
//		System.out.println(charArray);
//		System.out.println(charArray2);
//		
//		if(Arrays.equals(charArray, charArray2)) {
//			System.out.println("It is a Anagram");
//		}
//		else {
//			System.out.println("It is not a Anagram");
//		}
		
		
	}
}
