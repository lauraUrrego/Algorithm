package com.hackerRank;

import java.util.Scanner;

public class Solution {

	  public static void main(String[] args) {
		    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	      
	        int[][] arr = new int[6][6];
	        arr[0][0]=0;
	        arr[0][1]=0;
	        arr[0][2]=0;
	        arr[0][3]=0;
	        arr[0][4]=0;
	        arr[0][5]=2;
	        arr[1][0]=0;
	        arr[1][1]=2;
	        arr[1][2]=0;
	        arr[1][3]=1;
	        arr[1][4]=1;
	        arr[1][5]=1;
	        arr[2][0]=2;
	        arr[2][1]=1;
	        arr[2][2]=1;
	        arr[2][3]=0;
	        arr[2][4]=2;
	        arr[2][5]=1;
	        arr[3][0]=2;
	        arr[3][1]=0;
	        arr[3][2]=0;
	        arr[3][3]=1;
	        arr[3][4]=0;
	        arr[3][5]=0;
	        arr[4][0]=2;
	        arr[4][1]=0;
	        arr[4][2]=0;
	        arr[4][3]=1;
	        arr[4][4]=1;
	        arr[4][5]=0;
	        arr[5][0]=0;
	        arr[5][1]=2;
	        arr[5][2]=1;
	        arr[5][3]=0;
	        arr[5][4]=0;
	        arr[5][5]=0;
	       
	        
	        int max = -64;
	        
	        for (int i = 0; i < 4; i++)
	        {
	            for (int j = 0; j < 4; j++)
	            {
	                int sum = arr[0 + i][0 + j] + arr[0 + i][1 + j] + arr[0 + i][2 + j] + arr[1 + i][1 + j] + arr[2 + i][0 + j] + arr[2 + i][1 + j] + arr[2 + i][2 + j];
	                max = Math.max(max, sum);
	            }
	        }
	        System.out.println(max);
		  
	  }
	    
}

