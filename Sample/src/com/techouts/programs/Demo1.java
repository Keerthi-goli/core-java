package com.techouts.programs;
import java.util.*;  

public class Demo1 {

	public static void main(String[] args) {

		project d=new project();
		Scanner s=new Scanner(System.in);
		System.out.println("enter n :");
		// a=s.nextInt();
		//d.primeNumbers(a);
		int c=d.input(a);
		if(c>0) {
			System.out.println(c + "Th rank");
		}
		else {
			System.out.println("Incorrect input");
		}
		if(s.hasNextInt()) {
			d.multiples(s.nextInt());
			
		}
		else {
			System.out.println("0");
		}
	}

}
