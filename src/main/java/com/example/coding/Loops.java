import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;


public class Loops {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();  //number of interations
        if (t < 0 || t > 500 ){
	     System.exit(0); 
        }

     
        //System.out.printf("\n%d %d %d %d", t,a,b,n);


        for(int i = 0; i < t; i++){
	
	        int a = sc.nextInt();  //number of interations
	        System.out.println(a);
	        if (a <  0 || a > 50 ){
		     System.exit(0); 
	        }

	        int b = sc.nextInt();  //number of interations
	        if (b <  0 || b > 50 ){
		     System.exit(0); 
	        }

	        int n = sc.nextInt();  //number of interations
	        if (n <  0 || n > 50 ){
		     System.exit(0); 
	        }
	   int ans = a;
	   String str = "";
	   int power = 1;
	    for(int j = 0; j <= n-1; j++){
		ans = ans + b* power;
		power = power * 2 ;
		System.out.printf("%d ",ans);
//		 ans = a + 2*j*b;
//		str = str + String.valueOf(ans) + " ";		
	    }
	System.out.printf("\n");
	    
        }
	





    }
}