package sorting.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortApplication {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fred", 25),
				new Person("Albert", 18),
				new Person("Abby", 25));

		people.sort(new AgeComparator());
		System.out.println("Order by age:" + people);

		people.sort(new NameComparator());
		System.out.println("Order alphabetically by name:" + people);

		people.sort(new AgeThenNameComparator());
		System.out.println("Order by age then name:" + people);

	}


}
