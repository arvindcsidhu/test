
public class Student implements Comparable<Student>{
	
	private String name;
	private int rollNo;
	private int age;
	
	Student(String name,int rollNo,int age){
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		
	}

	@Override
	public int compareTo(Student age) {
		Student st = (Student)age;
		if(st.age == this.age){
			return 0;
		}
		else if(this.age > st.age){
			return 1;
		}
		else
		return -1;
	}
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
