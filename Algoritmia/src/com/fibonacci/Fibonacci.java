package com.fibonacci;

public class Fibonacci {

	
	public static int fibonacciRecur(int n) {
		
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			return fibonacciRecur(n-1)+fibonacciRecur(n-2);
		}
		
	}
	
	public static void fibonacci(int number){
        for(int i=0; i <= number; i++){
            System.out.print(getFibonacci(i) + " ");
        }
    }
  
    /**
     * This function return nth Fibonacci number in Java
     * @param n
     * @return nth number in Fibonacci series
     */
    public static int getFibonacci(int n){
      
        if (n == 0) {
            return 0;
        }
        
        if (n == 1){
            return 1;
        }

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }
  

	
	public static void main(String[] args) {
		System.out.println(fibonacciRecur(6));
		
		fibonacci(6);
	}
}
