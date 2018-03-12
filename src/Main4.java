import java.util.Comparator;
import static java.util.Comparator.*;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
