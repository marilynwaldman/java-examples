package com.mdw;

public class Node {
    private static int Num_Chars = 26;
    Node[] children = new Node[Num_Chars];
    int size = 0;

    private static int getCharAtIndex(char c){
        return c - 'a';
    }

    private Node getNode(char c){

        return children[getCharAtIndex(c)];

    }

    private void setNode(Node node, char c){
        children[getCharAtIndex(c)] = node;
    }

    protected void add(String s, int index){
        size++;
        if(index == s.length())return;
        char c = s.charAt(index);
        Node child = getNode(c);
        if(child == null){
            child = new Node();
            setNode(child, c);
        }
        child.add(s, index + 1);
    }

    protected void add(String s){
        add(s,0);
    }

    public int findCount(String s, int index){
        //System.out.println(size);
        if(index == s.length()) return size;
        char c = s.charAt(index);
        Node child = getNode(c);
        if(child == null) return 0;
        return child.findCount(s, index + 1);
    }

}
