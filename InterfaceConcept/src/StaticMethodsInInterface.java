import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class StaticMethodsInInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<String> countrylst = Arrays.asList("India", "America", "Japan", "Brazil");
//	        countrylst.sort(Comparator.naturalOrder()); // will sort in String natural sorting order
	       
//		  for (String countryName : countrylst) {
//	            System.out.println(countryName);
//	        }
		  
		  countrylst.sort(Comparator.naturalOrder());
		  for (String string : countrylst) {
			System.out.println(string);
		}
		  System.out.println("/////////////////////////");
		  countrylst.sort(Comparator.reverseOrder());
		  for (String string : countrylst) {
			System.out.println(string);
		}

	}

}
