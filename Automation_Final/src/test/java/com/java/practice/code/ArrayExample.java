package com.java.practice.code;

import java.util.*;

public class ArrayExample {
	int i = 0;
	/*
	 * An array is a container object that holds a fixed number of values of a
	 * single type. The length of an array is established when the array is created.
	 */
	public static void singleDimensionalArray() {
		int[] num = new int[6]; // it is fix
		
		int[][] number = {{ 1, 2, 3},
				          {  4, 5, 6 }};
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		num[5] = 60;
		System.out.println(Arrays.toString(num));
		//System.out.println(num[3]);
		
		// Basic for loop
	   for(int i = 0; i < num.length; i++) { // i j k
			System.out.println(i);
		}
			
		// Advance for loop/ Enhance for loop	
		for (int j : num) {
			System.out.println(j);
		} 
	}
	public static void multiDimensionalArray() {
		String[][] names = {{ "Mr. ", "Mrs. ", "Ms. " }, 
				            { "Alam", "Juma", "Tasvir" } 
				            };

		System.out.println(names[0][0] + names[1][2]);
        System.out.println(names[0][1] + names[1][1]);
	}

	public static void loopIncreaseValue() {
		for (int i = 0; i <= 1000; i++) {
			System.out.println(i);
		}
	}

	public static void loopDecreaseValue() {
		for (int i = 100; i > 1; i--) {
			System.out.println(i);

		}
	}

	    public static void javanewfeatureLoop() {
		// Java for each loop
		List<Integer> number = Arrays.asList(100, 30, 4, 45, 67, 576, 476);
		number.forEach(n -> System.out.println(n));

	}

	// How to sort Array in Java
	public static void sorting() {
		int[] array = { 45, 12, 85, 32, 89, 39, 69, 44, 42, 1, 6, 8 };		
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		};
	}

	public static void whileLoop() {
		int i = 1;
		while (true) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		//singleDimensionalArray();
		 //multiDimensionalArray();
		// loopIncreaseValue();
		//loopDecreaseValue();
		sorting();
		//whileLoop();\
		//javanewfeatureLoop();
	
	}

}
