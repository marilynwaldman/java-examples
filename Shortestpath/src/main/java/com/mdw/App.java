package com.mdw;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.LinkedHashMap;

public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {

        File file = new File("file1.txt");
        Scanner in = new Scanner(file);
        int numq = in.nextInt();
        for(int q = 1; q <= numq; q++){
            int numNodes = in.nextInt();
            int numEdges = in.nextInt();
            Graph graph = new Graph();
            LinkedHashMap<Integer, Integer> distances = new LinkedHashMap<Integer, Integer>();
            for(int i= 1; i <= numNodes; i++){
                 graph.addNode(i);
                 distances.put(i, Integer.MAX_VALUE);
            }
            for(int i = 1; i <= numEdges; i++){
                int src = in.nextInt();
                int dest = in.nextInt();
                graph.addEdge(src, dest);
                graph.addEdge(dest, src);
            }
            int startNode = in.nextInt();
            graph.getDistances(graph.getNode(startNode), distances);
            int i = 0;

            for(Integer key : distances.keySet()){
                if(key != startNode){
                    if(distances.get(key) == Integer.MAX_VALUE){
                        System.out.print("-1");
                    } else {
                        System.out.print(distances.get(key));
                    }
                    if(i < distances.keySet().size() -1){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
}
