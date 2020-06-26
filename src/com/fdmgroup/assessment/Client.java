package com.fdmgroup.assessment;

public class Client {

	public static void main(String[] args) {
		
		String str = "A hare is a fast animal";
		int r = 3;
		AssessmentSolution solution = new AssessmentSolution();
		String st= solution.wrap(str, r);
		System.out.println(st);		
	}
}

	

	

