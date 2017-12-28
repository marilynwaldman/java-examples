package com.mdw;

import java.util.HashMap;
public class App 
{
    public static void main( String[] args )
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String s = " now is the time for all good men to come to the aid of their country all good dogs and cats men";
        String note = "now good good good men horse";
        String[] split = s.split(" ");
        for( String str : split){
            if(!map.containsKey(str)){
                map.put(str,1);
            } else {
                map.put(str, map.get(str) + 1);
            }
        }
        System.out.println(isNote(map, note));
    }

    private static boolean isNote(HashMap<String, Integer> map, String note) {
        String[] split = note.split(" ");
        for(String s : split){

            if(!map.containsKey(s)) return false;
            if(map.get(s) < 1) return false;
            map.put(s, map.get(s) -1);


        }
        return true;
    }
}
