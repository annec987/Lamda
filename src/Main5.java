import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

/**
 * java.util.function 的應用風格
 * 
 * @author jackson
 *
 */
public class Main5 {
	static List<Integer> numbers1 = Arrays.asList(1, 2, 3);
	
	static List<Integer> numbers2 = Arrays.asList(1, 2, 3);

	public static void main(String[] args) {
		
		List<Integer> result1 = numbers1.stream()
				  .filter(e -> e > 50)
				  .collect(toList());
				   
		List<Integer> result2 = numbers2.stream()
		  .filter(e -> e > 50)
		  .map(e -> e * 2)
		  .collect(toList());

		/*
		Predicate<Integer> isGreaterThan50 = number -> number > 50;
		 
		List<Integer> result1 = numbers1.stream()
		  .filter(isGreaterThan50)
		  .collect(toList());
		   
		List<Integer> result2 = numbers2.stream()
		  .filter(isGreaterThan50)
		  .map(e -> e * 2)
		  .collect(toList());
		 */
	}
	
	public static void main2(String[] args) {
		List<Integer> valuesOver25 = numbers1.stream()
			  .filter(e -> e > 25)
			  .collect(toList());
			 
			List<Integer> valuesOver50 = numbers1.stream()
			  .filter(e -> e > 50)
			  .collect(toList());
			 
			List<Integer> valuesOver75 = numbers1.stream()
			  .filter(e -> e > 75)
			  .collect(toList());
			
		/*
		 
			Function<Integer, Predicate<Integer>> isGreaterThan = (Integer pivot) -> {
				  Predicate<Integer> isGreaterThanPivot = (Integer candidate) -> {
				    return candidate > pivot;
				  };
				   
				  return isGreaterThanPivot;
			};
			
			List<Integer> valuesOver25 = numbers1.stream()
					  .filter(isGreaterThan.apply(25))
					  .collect(toList());
					 
					List<Integer> valuesOver50 = numbers1.stream()
					  .filter(isGreaterThan.apply(50))
					  .collect(toList());
					 
					List<Integer> valuesOver75 = numbers1.stream()
					  .filter(isGreaterThan.apply(75))
					  .collect(toList());
		 */
			
//			Function<Integer, Predicate<Integer>> isGreaterThan = (pivot) -> {
//				  Predicate<Integer> isGreaterThanPivot = (candidate) -> {
//				    return candidate > pivot;
//				  };
//				   
//				  return isGreaterThanPivot;
//				};
				
//			Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> {
//				  return candidate -> {
//				    return candidate > pivot;
//				  };
//				};
			
//			Function<Integer, Predicate<Integer>> isGreaterThan = pivot -> {
//				  return candidate -> candidate > pivot;
//				};
			
//			Function<Integer, Predicate<Integer>> isGreaterThan = 
//					  pivot -> candidate -> candidate > pivot;
	}
	
}
