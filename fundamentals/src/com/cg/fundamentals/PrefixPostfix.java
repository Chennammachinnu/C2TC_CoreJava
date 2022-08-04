package com.cg.fundamentals;

public class PrefixPostfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int numA = 5;
	    int numB = 10;
	    int numC = 0;

	    numC = --numC + numB-- + numB++;
	    //OR
	   /* System.out.println("numB =" +numB);
	    numB--;
	    System.out.println("numB =" +numB); */
	    System.out.println(numA);
	    System.out.println(numC);
	    System.out.println(numB);
	  

	}

}
