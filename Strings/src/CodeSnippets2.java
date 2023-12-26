


public class CodeSnippets2 {

	public static void main(String[] args) {
		String data=null+"null";
		String data1="null"+null;
		
		System.out.println(data.charAt(3));
		System.out.println(data1);
		
		String name="sachin";
		System.out.println(name.toString() );
		System.out.println(new String("dhoni"));
		
		String month=new String("Jan");
		System.out.println(month);
		
//		String year=null;
//		System.out.println(year.charAt(2));
		
		System.out.println("1".repeat(3));
		
		String space=" ";
		System.out.println(space.isBlank());
		System.out.println(space.isEmpty());
		System.out.println(space.length());
	}

}
