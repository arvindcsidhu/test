
public class SelectionSort {
	
	public int[] selectionList(int[] list){
		
		 for (int i = 0; i < list.length; i++)        
		 { 
			 int index = i;            
		 for (int j = i ; j < list.length; j++)  {
			 if (list[j] < list[index]){             
				 index = j;   
			 }
		 int smallerNumber = list[index];             
		 list[index] = list[i];             
		 list[i] = smallerNumber;         
		 } 
		 }
		
		
		return list;
	}
	
	public static void main(String args[]){
		
		SelectionSort sort = new SelectionSort();
		int[] selList= {7,8,5,4,9,2};
		int [] sortedList = sort.selectionList(selList);

		for(int k = 0; k < sortedList.length ; k++){
		
			System.out.println(sortedList[k]);
		}
		
		
	}

}
