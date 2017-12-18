package com.mdw;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[][] land = {{0,2,1,0}, {0,1,0,1}, {1,1,0,1}, {0,1,0,1}};
        ArrayList<Integer> list = getPonds(land);

        for(Integer i : list){
            System.out.println(i);
        }

    }

    private static ArrayList<Integer> getPonds(int[][] land) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int r = 0; r < land.length; r++) {
            for (int c = 0; c < land[r].length; c++) {
                int size = 0;
                if (land[r][c] == 0) {
                    size = size + getLandSize(land, r, c);
                    list.add(size);
                }
            }
        }
        return list;

    }

    private static int getLandSize(int[][] land, int r, int c) {
        int size = 1;

        if(r < 0 || c < 0 || r >= land.length || c >= land[r].length || land[r][c] != 0) return 0;

        land[r][c] = -1;
        for(int dr =  -1; dr <=  1; dr++){
            for(int dc = -1; dc <= 1; dc++){
                size = size + getLandSize(land,r+dr, c + dc );

            }
        }

        return size;

    }

}
