package com.mdw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String s1 = "helloworld";
        String s2 = "hellodolly";
        String s3 = "hello";

        Node trie = new Node();
        trie.add(s1);
        trie.add(s2);
        trie.add(s3);
        System.out.println(trie.findCount("dog",0));

    }
}
