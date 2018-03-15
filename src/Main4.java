import java.util.Comparator;
import static java.util.Comparator.*;

/**
 * 类型推断 - 推断的局限性
 * 
 * @author jackson
 *
 */
public class Main4 {

	public static void main(String[] args) {
	}
	
	public static Comparator<Car> createComparator() {
	  return comparing((Car car) -> car.getRegistration());
	}
	
	public static Comparator<Car> createComparator2() {
	  return comparing(car -> car.getRegistration());
	}
	
	public static Comparator<Car> createComparator3() {
	  return comparing(Car::getRegistration).reversed();
	}

	class Car {
	  public String getRegistration() { return null; }
	}
}
