import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	/**
	 * 函數式編程
	 * 
	 * 不斷的透過函式逐層推導出複雜的運算，而不是設計一個相對複雜的執行程序
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jack", "Jill", "Nate", "Kara", "Kim", "Jullie", "Paul", "Peter");
		
		//用","符號串接名字長度等於４的人名
		
		// 1.
		List<String> subList = new ArrayList<String>();
		for(String name : names) {
		  if(name.length() == 4)
		    subList.add(name);
		}
		 
		// 2.
		StringBuilder namesOfLength4 = new StringBuilder();
		for(int i = 0; i < subList.size() - 1; i++) {
		  namesOfLength4.append(subList.get(i));
		  namesOfLength4.append(", ");
		}
		  
		// 3.
		if(subList.size() > 1) {
			namesOfLength4.append(subList.get(subList.size() - 1));			
		}
		 
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
