
public class Test3 {
	public void m1(int[]... x)
	{
		System.out.println(x);
		for (int[] i : x) {
			System.out.println(i);
			for (int js : i) {
				System.out.print(js+" ");
			}
			System.out.println();
		}
	}
}
