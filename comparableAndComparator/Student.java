package comparableAndComparator;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int age;

	public Student(int id, String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//comparable
	@Override
	public int compareTo(Student St) {
		if (this.id>St.id) {
			return 1;
		} else 
			return -1;
	}

}
