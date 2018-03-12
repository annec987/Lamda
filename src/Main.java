import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
		 
		List<String> subList = new ArrayList<>();
		for(String name : names) {
		  if(name.length() == 4)
		    subList.add(name);
		}
		 
		StringBuilder namesOfLength4 = new StringBuilder();
		for(int i = 0; i < subList.size() - 1; i++) {
		  namesOfLength4.append(subList.get(i));
		  namesOfLength4.append(", ");
		}
		        
		if(subList.size() > 1)
		  namesOfLength4.append(subList.get(subList.size() - 1));
		 
		System.out.println(namesOfLength4);

	}
	
//	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
//        
//		System.out.println(
//		  names.stream()
//		    .filter(name -> name.length() == 4)
//		    .collect(Collectors.joining(", ")));
//
//	}

}