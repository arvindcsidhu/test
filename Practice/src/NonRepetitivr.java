

import java.util.ArrayList;
import java.util.List;

public class NonRepetitivr {
	
	public static void main(String args[]){
		
		List<Character> list = new ArrayList<Character>();
		
		String test = "stress";
		
	/*	for(int i = 0 ; i < test.length() ; i++){
			
			Character c = test.charAt(i);
			if(list.size() == 0){
				list.add(c);
			}else{
				
				if(list.contains(c)){
					
					list.remove(c);
					
				}else{
					
					list.add(c);
				}
				
			}
		}
		
		for(int i = 0 ; i < list.size() ; i++){
			
			System.out.println(list.get(i));
		}*/
		
		for(char i :test.toCharArray()){
			if(test.indexOf(i)!=test.lastIndexOf(i)){
			System.out.println(i);
			break;
			}
			}
		
	}

}
