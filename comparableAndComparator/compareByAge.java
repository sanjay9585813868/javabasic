package comparableAndComparator;

import java.util.Comparator;

public class compareByAge implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		if (s1.getAge() > s2.getAge())
			return 1;
		else if (s1.getAge() < s2.getAge())
			return -1;
		else
			return 0;
	}

}
