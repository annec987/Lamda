import java.util.Arrays;
import java.util.List;

public class FindNemo {

	/**
	 * 比較 命令式＆声明式
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");

		//命令式
		boolean find = findNemo(names);
		
		System.out.println(find);
		
		//声明式
		find = names.stream().anyMatch(n -> n.equals("Nemo"));
		
		System.out.println(find);
	}

	public static boolean findNemo(List<String> names) {
		boolean found = false;
		for (String name : names) {
			if (name.equals("Nemo")) {
				found = true;
				break;
			}
		}
		
		return found;
	}

}
