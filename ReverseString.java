package com.mkyong.quartz;

public class Reverse {

	public static void main(String args[]) {

		String abc = "Hello World  ";
		
		String ab = "array";
		
		char [] abarr = ab.toCharArray();

		String[] arr = abc.split(" ");

		StringBuilder builder = new StringBuilder();

		for (int i = arr.length-1; i >= 0; i--) {

			builder.append(arr[i]).append(" ");

		}

		System.out.println(builder.toString());
		
		StringBuilder builder1 = new StringBuilder();
		
		for(int k = abarr.length-1 ; k >= 0 ; k--){
			
			builder1.append(abarr[k]);
		}
		
		System.out.println(builder1.toString());

	}

}
