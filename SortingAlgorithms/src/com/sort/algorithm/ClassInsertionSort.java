package com.sort.algorithm;

import java.util.Arrays;

public class ClassInsertionSort {

	public int[] sort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {

			int index = i;
			int j = i + 1;

			while (index >= 0 && !(list[j] > list[index])) {
	
				list = swap(list, index, j);
				index--;
				j--;
			}

		}

		return list;
	}

	public int[] swap(int[] list, int i, int j) {

		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
		System.out.println(Arrays.toString(list));
		return list;
	}

	public static void main(String[] args) {

		ClassInsertionSort sort = new ClassInsertionSort();
		int[] list = { 12, 35, 87, 26, 9, 28 };
		sort.sort(list);

	}

}
