import java.util.HashMap;

public class HashmapImpl {
	
	public static void main(String arg[]){
		
		HashMap<String,Integer> map = new HashMap<>();
		String a1 = "abcdef";
		String a2 = "abcdfG";
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		map.put("abcdef", 1);
		map.put("abcdfG",2);
		System.out.println(map);
		
	}

}
