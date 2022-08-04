package com.cg.fundamentals;

import java.util.Random;

public class RelationalLogicalOperators {

	public static void main(String[] args) {
		// Relational Operators
		
		
		  //  Random rand = new Random();
		 //  int i= rand.nextInt(3);
		 //  int j= rand.nextInt(5);
		  //  int i = rand.nextInt(100);
		   // int j = rand.nextInt(100);
		   // rand.nextInt(i);
		  //  rand.nextInt(j);
		int i=10;
		int j=90;
		    System.out.println("i = " + i);
		    System.out.println("j = " + j);
		    System.out.println("i > j is " + (i > j));
		    System.out.println("i < j is " + (i < j));
		    System.out.println("i >= j is " + (i >= j));
		    System.out.println("i <= j is " + (i <= j));
		    System.out.println("i == j is " + (i == j));
		    System.out.println("i != j is " + (i != j));
		    
		    //Logical Operators
		    System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
		    System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
		  
	
	//Ternary Operator
	
	int v = 4;
	
	System.out.println (v == 4 ? "A" : "B");
	System.out.println("v =" + v);

   //--v;  //--v=v
   ++v;  //++v=v
	System.out.println("v =" + v);
    
    System.out.println(v == 4 ? "A" : "B");
	}
}





