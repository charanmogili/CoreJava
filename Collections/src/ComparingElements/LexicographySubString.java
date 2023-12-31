package ComparingElements;

public class LexicographySubString {

	public static void main(String[] args) {
     String s="welcometojava";
     System.out.println(getSmallestAndLargest(s,3));
	}

	public static String getSmallestAndLargest(String s, int k) {
		// TODO Auto-generated method stub
		String smallest= s.substring(0,k);
		String largest=s.substring(0, k);
		
		for(int i=0;i<=s.length()-k;i++) {
			String subString=s.substring(i, i+k);
			
			if(subString.compareTo(smallest)<0) {
				smallest=subString;
			}
			if(subString.compareTo(largest)>0){
				largest=subString;
			}
		}
		return smallest+"\n"+largest;
	}
}
