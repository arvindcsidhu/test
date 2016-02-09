package com.sort.algorithm;

public class InsertionSort {
	
public int[] selection(int[] list,int n){
		
		for(int i = 1 ; i < n-1 ; i++){
			
			int j = i; 
			
			while(j > 0 && list[i -1] > list[i]){
				
				int temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			   j--;
			}
			
		}
		
		return list;
	}
	
public static void main(String args[]){
	
	
		
		int[] list = {2,7,8,4,6,1};
		InsertionSort sort = new InsertionSort();
		int[] sortedList  = sort.selection(list,6);
		for(int i = 0 ; i < sortedList.length ; i++){
			System.out.println(sortedList[i]);
		}
	}

}
