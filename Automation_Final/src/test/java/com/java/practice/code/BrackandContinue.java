package com.java.practice.code;


public class BrackandContinue {

	
	// How to break you loop & continue 
	public static void main(String[] args) {
		
		int i;
		for (i = 1; i<10; i++) {
			System.out.println(i);
			if (i == 9)  // Now breaking the value on 5 position 
			break;
		} 
		
	int k;	
	for (k =1; k<10; k++) {
		if (k==5) { // How to skip the number
			continue;
		}
		System.out.println(k);
	}

	}

}
