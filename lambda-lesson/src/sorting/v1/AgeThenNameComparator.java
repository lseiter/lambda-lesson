package sorting.v1;

import java.util.Comparator;

public class AgeThenNameComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		int ageCompare = Integer.compare(p1.getAge(),
				p2.getAge());
		return (ageCompare == 0) ? 
				p1.getName().compareTo(p2.getName()): 
					ageCompare;
	}
}
