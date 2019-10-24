package com.doheum.exam;

public class ArrayTest {
	public static void main(String[] args) {
		
		/*
		int[] array2 = new int[10];
		array2[0] = 210;
		
		System.out.println(array2[0]);
		*/
		
		String[] array3 = new String[5];
				
		String str1 = new String("하나");		
		array3[0] = str1;
		array3[1] = "둘";
		
		printArrayValue(array3);
		
		
		int[] array = {4, 5, 10, 22, 80, 11};		
		
		printArrayValue(array);
		
		
		int[] arr2 = {10, 20};
		printArrayValue(arr2);
	}
	public static void printArrayValue(String[] arr) {
		for(String str : arr) {
			System.out.println(str);
		}
	}
	
	public static void printArrayValue(int[] arr) {
		int sum = 0;
		/*
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum += arr[i];
		}
		*/
		for(int sadf : arr) {
			System.out.println(sadf);
			sum += sadf;
		}
		System.out.println("합계 : " + sum + "입니다.");
		System.out.printf("합계 : %d입니다.\n", sum);
	}
}

























