package com.fibosuite.net;

import java.util.Scanner;

public class Fibonacci {
	
	
	public static int fiboSuite(int counter) {
    
		Scanner s = new Scanner(System.in);
		
		int a=0;
		int b=1;
		int i;
		int c = 0;
		
		
        for(i=2; i<=counter; ++i)
        {    
            c = a+b;       
            a = b;
            b = c;

            System.out.print(" "+c);


	    }
		return c;
		
		
	}

	public static void main(String[] args) {

		fiboSuite(20);
 } 

	
}
