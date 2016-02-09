import java.util.Comparator;

public class StudentAgeComparator implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		StudentComparator S1 = (StudentComparator)o1;
		StudentComparator S2 = (StudentComparator)o2;
		
		if(S1.getAge() == S2.getAge()){
			return 0;
		}
		else if(S1.getAge() > S2.getAge()){
			return 1;
		}
		else
		return -1;
	}
}
