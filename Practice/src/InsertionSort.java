
public class InsertionSort {
	
	public static void main(String sidhu[]){
		
		InsertionSort in = new InsertionSort();
		int[] list = {5,8,1,6,4,2};
		int[] listSorted = in.insert(list);
		for(int i = 0 ; i < listSorted.length ; i++){
			System.out.println(listSorted[i]);
		}
		
	}
	
	public int[] insert(int[] list){
		
		int i,j,temp,key;
		
		for(i = 1 ; i < list.length ; i++){
			
			key = list[i];
			j = i -1;
			
			while(j>=0 && key < list[j]){
				
				temp = list[j];
				list[j] = list[j+1];
				list[j+1]=temp;
				j--;
			}
			
		}
		
		
		return list;
	}

}
