package com.fdmgroup.assessment;

public class AssessmentSolution {
	
	private String string;
	int myInt;
	private static final char BREAK = '\n';
	
	public static String wrap(String string, int myInt){
		
		for(int i=0; i < string.length(); i++) {
		
		 return string.substring(0, myInt) + BREAK + string.substring(myInt);
		 
		
		}
		return string;
		}
		
		
	}

//My solution did not work. It breaks only the first time.