package comparableAndComparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSort {
	
	public static void main(String[] args) {

		Student s1=new Student(1, "sanjay",23);
		Student s2=new Student(4, "fel",22);
		Student s3=new Student(2, "jack",21);
		Student s4=new Student(3, "ruban", 24);
		List<Student> li=Arrays.asList(s1,s2,s3,s4);
		
		compareByAge age=new compareByAge();
		//sorting by age
		System.out.println("________________________");	
		System.out.println("before sorting by age");
		System.out.println("________________________");	
		
		for (Student student : li) {
			System.out.println(student.getAge()+" "+student.getName()+" "+student.getId());
		}
		
		Collections.sort(li, age);
		System.out.println("________________________");
		for (Student student : li) {
			System.out.println(student.getAge()+" "+student.getName()+" "+student.getId());
		}

		System.out.println("________________________");		
		System.out.println("before sorting by name");
		System.out.println("________________________");	
		for (Student student : li) {
			System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
		}
		CompareByName name=new CompareByName();
		Collections.sort(li,name);
		System.out.println("________________________");
		for (Student student : li) {
			System.out.println(student.getName()+" "+student.getAge()+" "+student.getId());
		}
		System.out.println("________________________");		
		System.out.println("before sorting by id");
		System.out.println("________________________");	
		for (Student student : li) {
			System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
		}
		Collections.sort(li);
		System.out.println("________________________");
		for (Student student : li) {
			System.out.println(student.getId()+" "+student.getName()+" "+student.getAge());
		}
	}

}
