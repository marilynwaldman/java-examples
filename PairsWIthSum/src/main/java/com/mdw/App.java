package com.mdw;
import java.util.HashMap;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int sum = 12;
        int[] array = { -2, -1, 0, 3, 5, 6, 7, 9, 13, 14};
        HashMap<Integer, Integer> unpaired = new HashMap<Integer, Integer>();
        ArrayList<Pair> list = new ArrayList<Pair>();

        for(int i : array){
            int complement = sum - i;

            if(unpaired.getOrDefault(complement,0 ) > 0){
                list.add(new Pair(i, complement));
                unpaired.put(complement, unpaired.getOrDefault(complement,0) - 1);
            } else {
                unpaired.put(i, unpaired.getOrDefault(i, 0) + 1);

            }
        }
        for(Pair pair : list){
            System.out.println(pair.x + " " + pair.y);
        }

    }
}
