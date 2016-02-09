import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentComparatorMain {

	public static void main(String[] args) {
		  
		StudentComparator s1 = new StudentComparator("sidhu",1,28);
		StudentComparator s2 = new StudentComparator("tabu",2,29);
		StudentComparator s3 = new StudentComparator("abhi",3, 35);
		ArrayList<StudentComparator> studentList = new ArrayList<StudentComparator>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		Collections.sort(studentList,new StudentAgeComparator());
		
		Iterator<StudentComparator> it = studentList.iterator();
		while(it.hasNext()){
			StudentComparator st = (StudentComparator)it.next();
			System.out.println(st.getName()+","+st.getAge()+","+st.getRollno());
		}
		
		Collections.sort(studentList,new StudentNameComaparator());
		
		Iterator<StudentComparator> it1 = studentList.iterator();
		while(it1.hasNext()){
			StudentComparator st = (StudentComparator)it1.next();
			System.out.println(st.getName()+","+st.getAge()+","+st.getRollno());
		}
	}
}
