import java.util.Comparator;

public class StudentComparator{
	
	private int rollno;
	private String name;
	private int age;
	
	StudentComparator(String name,int rollno,int age){
		
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



}
