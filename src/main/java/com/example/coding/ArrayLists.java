import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayLists {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>[] lists = (ArrayList<Integer>[])new ArrayList[n];
        if( n < 1 || n > 20000){
            System.exit(0);
        }
        for(int i=0; i <=n-1 ; i++){
            int d = sc.nextInt();
            if (d < 0 || d > 50000){
                System.exit(0);
            }
            lists[i] = new ArrayList<Integer>();
            for( int j=0; j <= d-1; j++){
                int x = sc.nextInt();
                lists[i].add(x);
            }
            
        }
        int q = sc.nextInt();
        if( q < 0 || q > 1000){
            System.exit(0);
        }
        
        System.out.println(q);
        for ( int i = 0 ; i <= q -1; i++){
            int line = sc.nextInt();
            System.out.println(line);
            
            int index = sc.nextInt();
            System.out.println(index);
            System.out.println(lists[line-1].size());
            if (line < 1 || line > n ){
                
                System.out.println("ERROR!");  
            }
            else if ( index < 0 || index > lists[line-1].size()){
	        
                System.out.println("ERROR!");
            }
            else {
                System.out.println(lists[line-1].get(index-1));
            }
            
        }
    }
}