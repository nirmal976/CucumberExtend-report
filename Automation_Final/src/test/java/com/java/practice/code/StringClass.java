package com.java.practice.code;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class StringClass {
	    // What is a String? 
		// Why String is a immutable?
		// When we declare the value we cannot change it 
		
		// StringBuffer & StringBuider
		
	    // StringBuffer is a mutable class & synchronized
		// StringBuider is a mutable class & not synchronized
		
		public static void stringImutable() {
			// Why String is a immutable?	
			String name = "Smarttech";
			       name = "Inc";
			       name = "Alam";
			       System.out.println(name);
			
		}
		public static void string1() {
		String obj = new String("UPS ");
		       obj.concat("COMPANY");
		       System.out.println("I am a String class : "+obj);
	}
		
		public static void stringBuffer() {
			StringBuffer obj = new StringBuffer("UPS ");
			obj.append("COMPANY");
			System.out.println("I am a StringBuffer class : "+obj);
		}
		
		public static void stringBuilder() {
			StringBuilder obj = new StringBuilder("UPS ");
			obj.append("COMPANY");
			System.out.println("I am a StringBuilder class : "+obj);
		}
		
		// How to compare to string
		public static void testEqual() {
			String s5 = "SMARTTECH";
			String s6 = "SMARTTECH";
			System.out.println(s5==s6); // true
			System.out.println(s5.equals(s6)); // true
			
			String s1 = new String("SMARTTECH");
			String s3 = new String("SMARTTECH");
			System.out.println(s1==s3); // false // Object 
			System.out.println(s1.equals(s3)); // true
			
			
		}
		// How to remove special sing form your string
	public static void removeSpecialsign()	{
		String value = "My#Name%Is*Mohaame&Alam$.";
		value = value.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(value);
		
		String num = "10,500.99";
		num = num.replaceAll("\\W+", " ");
		System.out.println(num);
	}
		
	// How to remove extra space from your string value 
	public static void removeExtraSpace() {
		String name = "Smart   tech   it   sulition     in";
		StringTokenizer obj = new StringTokenizer(name, " ");
		StringBuffer sb = new StringBuffer();
		while(obj.hasMoreElements()) {
			sb.append(obj.nextElement()).append(" ");			
		}
		System.out.println("Before Remove space : " + name);
		System.out.println("Remove Extra space : " + sb.toString().trim());
		
	}
	
	
// 1. How to find the even number & odd number?  2  1
// 2. How to find the plandrom number?   232  454  level  mom
// 3. How to find prime number?
	
	
	public static void evenNumbar() {
		// Declare the value 
		int [] numbers = new int[] {1,2,3,4,5,6,7,8,9,0,12,34,5,65,67};
		// Do looping
		for(int i =0; i<numbers.length; i++) {
		// Conditional statement 
			if (numbers[i]%2 ==0)  // *+-
				System.out.println(numbers[i] +" Is Even number");
			else 
				System.out.println(numbers[i] +" Is odd number");
			
		}}
		
	// How to find out disable date
	public static void getDate() {
	   String days;
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(date);
		
		cal.add(Calendar.DAY_OF_YEAR, - 25);
		Date obj = cal.getTime();
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		days = format.format(obj);
		System.out.println("After one week date select : "+days);
		
		
	}
		
	
		public static void main(String[] args) {
			getDate();
			//evenNumbar();
			removeExtraSpace();
			//removeSpecialsign();
			//testEqual();
			//string1();
			//stringBuffer();
			//stringBuilder();
		}
	}

