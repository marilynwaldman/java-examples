package com.mdw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[][] array = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] arrayCopy = new int[array.length][array.length];
        for(int i=0; i<array.length; i++)
            for(int j=0; j<array[i].length; j++)
                arrayCopy[i][j]=array[i][j];
        printArray(array);

        rotate(array, arrayCopy);
        //printArray(array);

    }

    private static void printArray(int[][] array){
        for(int i = 0; i < array.length ; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.print( array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] array, int[][] arrayCopy) {

        //for each layer :
        //left -> top
        //top  -> right
        //right -> bottom
        //bottom -> left
       // int index = 0;
        for( int index = 0; index <= array.length/2; index++){
            //for( int layer = array.length; layer > 1; layer= layer/2){
            int end = array.length -2;
            //System.out.println(layer + " " + end);
            //save top
            int row = index;
            int col = index;
            rotateLeftToTop(array, arrayCopy, index, index);
            rotateTopToRight(array, arrayCopy, index, index);
            rotateRightToBottom(array, arrayCopy, index, index);
            rotateBottomToLeft(array, arrayCopy, index, index);
            printArray(array);
        }

    }

    private static void rotateBottomToLeft(int[][] array, int[][] arrayCopy, int row, int col) {
        for(int i=row; i < array.length - row; i++){
            System.out.println(" row " + row + " col " + i);
            array[i][col] = arrayCopy[array.length -col -1][i];

        }
    }

    private static void rotateRightToBottom(int[][] array, int[][] arrayCopy, int row, int col) {
        for(int j=col; j < array.length - col; j++){
            System.out.println(" row " + row + " col " + j);
            array[array.length - row -1][j] = arrayCopy[array.length - j-1][array.length -row -1];

        }
    }

    private static void rotateTopToRight(int[][] array, int[][] arrayCopy, int row, int col) {
        for(int i=row; i < array.length - row; i++){
            System.out.println(" row " + row + " col " + i);
            array[i][array.length-col-1] = arrayCopy[row][i];

        }
    }

    private static void rotateLeftToTop(int[][] array, int[][] arrayCopy, int row, int col) {
        //int end=  array.length-col;
        //System.out.println(row + " " + col + "  array.length - col " + end);


        //save top;
        for(int j=col; j < array.length - col; j++){
            System.out.println(" row " + row + " col " + j);
            array[row][j] = arrayCopy[j][row];

        }

    }
}
