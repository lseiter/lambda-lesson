package sorting.v2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortApplication {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Fred", 25),
				new Person("Albert", 18),
				new Person("Abby", 25));

		people.sort(new Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				return Integer.compare(p1.getAge(),p2.getAge());
			}
		});
		System.out.println("Order by age:" + people);

		people.sort(new  Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}

		});
		System.out.println("Order alphabetically by name:" + people);

		people.sort(new  Comparator<Person>(){
			@Override
			public int compare(Person p1, Person p2) {
				int ageCompare = Integer.compare(p1.getAge(),
						p2.getAge());
				return (ageCompare == 0) ? 
						p1.getName().compareTo(p2.getName()): 
							ageCompare;
			}
		});
		System.out.println("Order by age then name:" + people);

	}


}
