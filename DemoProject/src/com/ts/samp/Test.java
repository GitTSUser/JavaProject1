package com.ts.samp;

import java.util.Locale;

public class Test {
	
	public static void main(String ar[]) {
	
		System.out.println("welcome to test");
	
		for(int i=1;i<=10;i++)
		System.out.println("Num is:"+i);
		
		String[] locale=Locale.getISOCountries();
		
		for(String country:locale) {
		System.out.println("country is:"+country);
		
		}
	}
}