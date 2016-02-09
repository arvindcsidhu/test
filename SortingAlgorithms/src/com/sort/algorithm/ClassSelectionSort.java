package com.sort.algorithm;

import java.util.Arrays;

public class ClassSelectionSort {

	public int[] sort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			int imin = i;
			for (int j = i + 1; j < list.length; j++) {

				if (list[imin] > list[j]) {
					imin = j;
				}
			}

			if (i != imin && list[i] != list[imin])
				list = swap(list, i, imin);

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

		ClassSelectionSort sort = new ClassSelectionSort();
		int list[] = { 5, 4, 8, 1, 3, 6 };
		System.out.println(Arrays.toString(list));
		int[] Sortedlist = sort.sort(list);
		/*
		 * for (int i = 0; i < Sortedlist.length; i++) {
		 * System.out.println(Sortedlist[i]); }
		 */
	}

}
