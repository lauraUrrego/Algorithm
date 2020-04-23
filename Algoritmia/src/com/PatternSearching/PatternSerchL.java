package com.PatternSearching;

public class PatternSerchL {
	
	

	
	public static void main(String[] args) {
		String text="AABABAAB";
		String path="AAB";	
		
		
		for(int i=0; i<text.length();i++) {
			int j;
			
			for(j=0;j<path.length();j++) {
				if(text.charAt(i+j)!=path.charAt(j))
					break;
			}	
			
			if(path.length()==j) 
				System.out.println("found"+i);			
			
		}		
	}
}
