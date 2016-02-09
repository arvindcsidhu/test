package com.sort.algorithm;

public class BubbleSort {
public int[] selection(int[] list,int n){
		
		for(int i = 0 ; i < n-1 ; i++){
			
			int indexi = i;
			int flag = 0;
			
			
			for(int j = i; j < n ; j++){
				
				if(list[indexi] > list[j]){
					
					int temp = list[indexi];
					list[indexi] = list[j];
					list[j] = temp;
					
				}
				
			}
			
			/*if(flag == 0){
				break;
			}*/
			
			
		}
		
		return list;
	}
	
	
	public static void main(String args[]){
		
		int[] list = {2,7,8,4,6,1};
		BubbleSort sort = new BubbleSort();
		int[] sortedList  = sort.selection(list,6);
		for(int i = 0 ; i < sortedList.length ; i++){
			System.out.println(sortedList[i]);
		}
	}
}
