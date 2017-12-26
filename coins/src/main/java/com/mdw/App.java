package com.mdw;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class App 
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        Scanner in = new Scanner(file);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }

        System.out.println(numWays(n, coins, 0));

    }

    private static long numWays(int amt, int[] coins, int index) {
        HashMap<String, Long> map = new HashMap<String, Long>();
        return numWays(amt, coins, index, map);

    }

    private static long numWays(int amt, int[] coins, int index, HashMap<String, Long> map) {

        long num = 0;
        if(amt ==0 )return 1;
        if(amt < 0 || index >= coins.length) return 0;
        //System.out.println("amt " + amt + " coin " + coins[index]);
        String key = amt + " - " + index;
        if(map.containsKey(key)){
            return map.get(key);
        }
        for( int i = 0; i*coins[index]  <= amt; i++){
            num += numWays(amt - i*coins[index] , coins, index + 1, map );
        }
        if(num > 0){
            map.put(key,num);
        }
        return num;
    }




}
