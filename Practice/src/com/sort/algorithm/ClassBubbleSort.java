package com.sort.algorithm;

public class ClassBubbleSort {

	private int[] sort(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {

			for (int j = i; j < list.length - 1; j++) {

				if (list[i] > list[j + 1]) {
					int temp = list[i];
					list[i] = list[j + 1];
					list[j + 1] = temp;
				}

			}

		}

		return list;
	}

	public static void main(String[] args) {

		ClassBubbleSort sort = new ClassBubbleSort();
		int[] list = { 4, 5, 7, 1, 6, 0 };

		int[] Sortedlist = sort.sort(list);
		for (int i = 0; i < Sortedlist.length; i++) {

			System.out.println(Sortedlist[i]);
		}

	}

}
