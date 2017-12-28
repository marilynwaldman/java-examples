package com.mdw;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class Graph {

    int id;
    HashMap<Integer,Node> graph = new HashMap<Integer, Node>();

    public class Node{
        int id;
        LinkedList<Node> adjaceny = new LinkedList<Node>();

        public Node(int id){
            this.id = id;
        }
    }

    public Node getNode(int id){
           return graph.get(id);
    }

    public void addNode(int id){
        if(getNode(id) == null){
            Node node = new Node(id);
            graph.put(id,node);
        }
    }

    public void addEdge(int source, int destination){
        Node srcNode = getNode(source);
        if (srcNode == null){
            srcNode = new Node(source);
        }
        Node destNode = getNode(destination);
        if(destNode == null){
            destNode = new Node(destination);
        }
        srcNode.adjaceny.add(destNode);
        graph.put(source,srcNode);
        return;


    }

    public void getDistances(Node startNode, LinkedHashMap<Integer, Integer> distances){
        Integer edgeDistance = 6;
        LinkedList<Node> queue = new LinkedList<Node>();
        distances.put(startNode.id, 0);

        queue.add(startNode);

        while(!queue.isEmpty()){
            Node node = queue.remove();
            int distanceToHere = distances.get(node.id);
            for(Node adjNode : node.adjaceny){
                if(adjNode.id == 6){
                    System.out.println("distance 6  " + distances.get(adjNode.id));
                    System.out.println(" Distance to here " + distanceToHere);
                }
                if(distances.get(adjNode.id) != Integer.MAX_VALUE){
                    if(distances.get(adjNode.id) > distanceToHere + edgeDistance){
                        distances.put(adjNode.id, distanceToHere + edgeDistance);
                    }
                } else {
                    queue.add(adjNode);
                    distances.put(adjNode.id, distanceToHere + edgeDistance);
                }
                if(adjNode.id == 6){
                    System.out.println(" after distance 6  " + distances.get(adjNode.id));
                    System.out.println(" Distance to here " + distanceToHere);
                }

            }

        }


    }
}
