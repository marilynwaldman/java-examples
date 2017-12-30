package com.mdw;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Iterator;

public class App 
{
    public static void main( String[] args ){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(1);

        removeDuplicates(list);
        for(Integer i : list){
            System.out.println(i);
        }


    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        HashSet<Integer> set = new HashSet<Integer>();
        Iterator it = list.iterator();
        int i = 0;
        while(it.hasNext()){
            it.next();
            int item  = list.get(i);
            if(set.contains(item)){
                it.remove();
            } else {
                set.add(item);
                i++;
            }


        }

    }

}
