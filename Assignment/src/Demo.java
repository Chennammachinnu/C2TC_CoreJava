import java.io.*;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		int salary = 0, tax;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter salary");
		sc.nextInt();
		if(salary>1000)
			System.out.println("tax=30%");
		else if(salary>500000)
			System.out.println("tax=20%");
		else
			System.out.println("tax=5%");
		
			

	}

}
