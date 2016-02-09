package com.sort.algorithm;

public class MergeSort {
	
	public int[] merge(int[] left,int right[],int[] list){

		int l = left.length;
		int r = right.length;
		int i  = 0; 
		int k = 0;
		int j = 0;
		while(  i < l && j < r){
			
			if(left[i] <= l){
				list[k] = left[i];
				
				i++;
			}
			else{
				
				list[k] = right[j];
				j++;
				
			}
			k++;
		}
		while( i < l){
			list[k] = left[i];
			
			i++;
			k++;
		}
		while(j < r){
			list[k] = right[j];
			j++;
			k++;
		}
		
		return list;
		
	}
	
	public int[] mergeSort(int[] list,int n){
		
		if(n < 2){
			return list;
		}
		int mid = n/2;
		
		int left[] = new int[mid];
		
		int[] right = new int[n-mid];
		
		 // Splitting the array in two
	    for (int i = 0; i < mid; i++) {
	    	left[i] = list[2 * i];
	    	right[i] = list[2 * i + 1];
	    }
		
		for(int i = 0 ; i < mid-1 ; i++){
			left[i] = list[i];
		}
		for(int j = mid ; j < n-1 ; j++){
			right[j-mid] = list[j];
		}
		mergeSort(left,left.length);
		mergeSort(right,right.length);
		 list = merge(left,right,list);
		return list;
	}
	
	public static void main(String args[]){
		
		int[] list = {2,7,8,4,6,1,5,3};
		MergeSort sort = new MergeSort();
		int[] sortedList  = sort.mergeSort(list,8);
		for(int i = 0 ; i < sortedList.length ; i++){
			
			System.out.println(sortedList[i]);
		}
		
	}
	

}
