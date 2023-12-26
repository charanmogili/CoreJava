
public class Methodchaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="charan";
		String data=name.toUpperCase();
		int l=data.length();
		System.out.println(l);
		
		System.out.println(name.toUpperCase().length());
		
		StringBuilder sb=new StringBuilder("mogili");
		sb.append(name).
		reverse().
		reverse().
		append(true).
		insert(sb.length(), "REDDY").
		delete(12, 16);
		
		
		System.out.println(sb);
	}

}
