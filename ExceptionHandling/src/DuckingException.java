
public class DuckingException {

	public static void main(String[] args) throws Exception {
		// if we are confident that there will be no exception at in the sleep time 
		// then only Duck the exception
		System.out.println("Before sleep");
		Thread.sleep(5000);
		System.out.println("after sleep");
	}
}
