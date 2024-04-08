package comparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class comparableSort {
	public static void main(String[] args) {

		Student s1=new Student(1, "sanjay",23);
		Student s2=new Student(4, "fel",22);
		Student s3=new Student(2, "jack",21);
		Student s4=new Student(3, "ruban", 24);
		List<Student> li=Arrays.asList(s1,s2,s3,s4);
		
		for (Student student : li) {
			System.out.println(student.getId()+" "+student.getName());
		}
		Collections.sort(li);
		System.out.println("-------after sort----------");
		for (Student student : li) {
			System.out.println(student.getId()+" "+student.getName());
		}
	}
}

