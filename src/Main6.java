import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 好的Lamda coding風格
 */
public class Main6 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
		
		//不要犯这个错误
		System.out.println(names.stream().filter(name -> name.startsWith("J")).filter(name -> name.length() > 3)
				  .map(name -> name.toUpperCase()).collect(Collectors.joining(", ")));
		
		//让您的代码简洁而不是生硬
		System.out.println(
				 names.stream()
				      .filter(name -> name.startsWith("J"))
				      .filter(name -> name.length() > 3)
				      .map(name -> name.toUpperCase())
				      .collect(Collectors.joining(", ")));
	}

}
