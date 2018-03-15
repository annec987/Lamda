import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import static java.util.stream.Collectors.*;

/**
 * Java Lamda表達式 
 * 語法
 * 方法引用
 * 靜態引用
 * 
 * @author jackson
 *
 */
public class Main3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		 
		numbers.stream()
		  .filter(e -> e % 2 == 0)
		  .forEach(e -> System.out.println(e));
		
		//通过方法引用
		numbers.stream()
		  .filter(e -> e % 2 == 0)
		  .forEach(System.out::println);
		
		Main3 main3 = new Main3();
		
		numbers.stream()
		.map(e -> main3.increment(e));
		
		numbers.stream()
		.map(main3::increment);
		
		
		numbers.stream()
		.map(e -> Integer.valueOf(e));
		
		numbers.stream()
		.map(Integer::valueOf);
	}
	
	public int increment(int number) {
	    return number + 1;
	}
	
	public static void main1(String[] args) {
		List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
		
		List<String> nonNullNamesInUpperCase = 
			    names.stream()
			      .filter(name -> Objects.nonNull(name))
			      .map(name -> name.toUpperCase())
			      .collect(collectingAndThen(toList(), list -> Collections.unmodifiableList(list)));
		
		//使用方法引用
		List<String> nonNullNamesInUpperCase2 = 
			    names.stream()
			      .filter(Objects::nonNull)
			      .map(String::toUpperCase)
			      .collect(collectingAndThen(toList(), Collections::unmodifiableList));
		
		//它的意思很简单：给定名称，过滤非 null 值，映射到大写形式，然后收集到一个不可修改的列表中
		
	}
}
