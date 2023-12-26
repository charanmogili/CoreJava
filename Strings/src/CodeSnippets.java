
public class CodeSnippets {

	public static void main(String[] args) {
		printNumbers(4);
		}
	public static  void printNumbers(int i) {
		
		if(i==0) {
			return;
		}
		System.out.println(i);
		printNumbers(i-1);
	}
	}

