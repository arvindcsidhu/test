import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentMain {
	
	
	public static void main(String[] args) {
	  
		Student s1 = new Student("sidhu",1,28);
		Student s2 = new Student("tabu",2,29);
		Student s3 = new Student("abhi",3, 35);
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Collections.sort(studentList);
		
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()){
			Student st = (Student)it.next();
			System.out.println(st.getName()+","+st.getAge()+","+st.getRollNo());
		}
	
	}

}
