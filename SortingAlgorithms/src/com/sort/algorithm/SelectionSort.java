package com.sort.algorithm;

public class SelectionSort {
	
	public int[] selection(int[] list,int n){
		
		for(int i = 0 ; i < n - 1 ; i++){
			
			int indexi = i;
			
			for(int j = i ; j<n;j++){
				
				if(list[j] < list[indexi]){
					indexi = j;
				}
			}
			int temp = list[i];
			list[i] = list[indexi];
			list[indexi] = temp;
			
		}
		
		return list;
	}
	
	
	public static void main(String args[]){
		
		int[] list = {2,7,8,4,6,1};
		SelectionSort sort = new SelectionSort();
		int[] sortedList  = sort.selection(list,6);
		for(int i = 0 ; i < sortedList.length ; i++){
			System.out.println(sortedList[i]);
		}
		
	}

}
