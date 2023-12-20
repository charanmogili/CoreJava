package mapPractice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StudentDatabase {
    public static void main(String[] args) {
        // Create a HashMap for the student database
    	HashMap<Integer, String> stdmap=new HashMap<Integer, String>();
        
        // Add students to the database
    	stdmap.put(6, "dhoni");
    	stdmap.put(2, "sachin");
    	stdmap.put(3, "virat");
    	stdmap.put(4, "bumrah");
        
        // Print the contents of the database
        Iterator<Entry<Integer, String>> stddb=stdmap.entrySet().iterator();
        while (stddb.hasNext()) {
			Entry<Integer,String> entry = stddb.next();
			System.out.print(entry);
			if(stddb.hasNext())
				System.out.print(",");
		}
    	System.out.println();
        // Search for a student's name by ID and print it
        int searchId=4;
        if(stdmap.containsKey(searchId))
        	System.out.println(stdmap.get(searchId));
        else
        	System.out.println("Key not found");
        
        String searchObject="dhoni";
        if(stdmap.containsValue(searchObject))
        	System.out.println(stdmap.get(searchObject));
        else
        	System.out.println("Not found");
        
    }
    
    // Implement a function to search for a student's name by ID
    // Return "Student not found" if the ID is not in the database
}
