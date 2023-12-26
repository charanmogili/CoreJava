import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class AutoClosable {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("abc.txt"))) {
			System.out.println("inside");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
