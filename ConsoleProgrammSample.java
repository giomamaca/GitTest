import java.util.ArrayList;
import java.util.HashMap;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
	      HashMap<Integer, String> numbers = new HashMap<>();

	        // insert entries to the HashMap
	        numbers.put(1, "Java");
	        numbers.put(2, "Python");
	        numbers.put(3, "JavaScript");
	        System.out.println("HashMap: " + numbers);

	        // mapping for the key is present in HashMap
	        String value1 = numbers.getOrDefault(1, "Not Found");
	        System.out.println("Value for key 1:  " + value1);

	        // mapping for the key is not present in HashMap
	        String value2 = numbers.getOrDefault(4, "Not Found");
	        System.out.println("Value for key 4: " + value2);
	}
}
