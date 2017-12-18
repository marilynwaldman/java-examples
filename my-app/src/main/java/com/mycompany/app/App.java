package com.mycompany.app;

/**
 * Hello world!
 *
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] a = {2,4,6,8,10,12,14,16,18,20};
        int[] b = {1,3,5,7,9,11,13,15,17,19};
        int lastA = 10;
        int lastB = 10;
        merge(a, b, lastA, lastB);
        System.out.println( "Hello World!" );
    }

    private static void merge(int[] a, int[] b, int lastA, int lastB) {
        int indexA = lastA - 1;
        System.out.println(a[9] + ' ' + lastA);
        int indexB = lastB - 1;
        int indexLast = lastA + lastB -1;

        while(indexB >= 0){
            if(indexA >= 0 && (a[indexA] > b[indexB]) ){
                a[indexLast] = a[indexA];
                indexLast --;
                indexA--;
            } else {
                a[indexLast] = b[indexB];
                indexLast--;
                indexB--;

            }
            for(int i: a){
                System.out.println(i);
            }
        }
    }
}
