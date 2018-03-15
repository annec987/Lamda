import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * 必須要懂的三個函式
 * filter
 * map
 * reduce
 */
public class Main2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
		
		names.stream().filter(t -> t.equals("Jack"));
		
		names.stream().map(t -> t.length());
		
		names.stream().collect(Collectors.counting());
	}

}
