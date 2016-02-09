import java.util.Comparator;

public class StudentNameComaparator implements Comparator<StudentComparator>{

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		StudentComparator S1 = (StudentComparator)o1;
		StudentComparator S2 = (StudentComparator)o2;
		
		return S1.getName().compareTo(S2.getName());
	}

}
