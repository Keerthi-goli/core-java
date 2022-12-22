package com.techouts.programs;

public class Duplicate {
	void dum(String r) {
		int p=8888;
		char[] a=new char[r.length()];
		for(int i=0;i<r.length()-1;i++) {
			a[i]=r.charAt(i);
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;i<a.length;i++) {
				if(a[i]==a[j]) {
					System.out.println("repeating positions");
					System.out.print(i+1);
//					a[i]=
				}
				
			}
			
			
		}
	}
	
	private void sampleMethod() {
		
	}


}
