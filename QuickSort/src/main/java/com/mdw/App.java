package com.mdw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = { 7,3,9,10,20,2,15,100,1,50,75};
        quickSort(array);
        for( int i : array){
            System.out.println(i);
        }
    }

    private static void quickSort(int[] array) {
        int left = 0;
        int right = array.length - 1;

        quickSort(array, left,  right);
    }

    private static void quickSort(int[] array, int left,  int right) {
        if(left >= right) return;

        int pivot = array[(right + left) / 2 ];
        int mid = partion(array, left, right, pivot);
        System.out.println(" mid " + mid);
        quickSort(array, left, mid -1);
        quickSort(array, mid, right);

    }

    private static int partion(int[] array, int left, int right, int pivot) {

        while(left <= right){
            while(array[left] < pivot){
                left ++;
            }

            while(array[right] > pivot){
                right--;
            }
            if(left <= right){
                swap(array, left, right);
                left++;
                right--;

            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
