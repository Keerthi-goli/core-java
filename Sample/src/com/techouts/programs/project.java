package com.techouts.programs;
import java.util.*;  
public class project {
	int m=0;
	public boolean prime(int c) {
		for(int i=2;i<c;i++) {
			if(c%i==0) {
				return false;
			}
		}
		return true;
	}
	public void primeNumbers(int d) {
		for(int i=1;i<d+1;i++) {
			if(prime(i)) {
				if(m<i) {
					m=i;
				}
			}	
			else {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println("biggest prime" +" "+ m);
	}
	public int input(int d) {
		for(int i=1;i<11;i++) {
			if(d==i) {
				return d;
		
			}
		}
		return 0;
	}
	public void multiples(int d) {
		for(int i=0;i<d+1;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
	}

}
