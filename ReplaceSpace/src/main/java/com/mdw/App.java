package com.mdw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String s = " adsf ffa sfasfad fafdf ";
        for( int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                s = s.substring(0,i) + "%20" + s.substring(i+1);
            }
        }
        System.out.println(s);
    }
}
