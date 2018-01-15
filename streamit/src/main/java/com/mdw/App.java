package com.mdw;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Compute f(g(x)) where
 *             g(x) = x*x
 *        and  f(x)  = 3x + 4
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> domain = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> range=
                domain.stream()
                        .map(x -> {
                            return x * x;
                        })
                        .map(x -> {
                            return 3*x + 4;
                        })
                        .collect(Collectors.toList());


        //range.forEach(System.out::println);
        int result =
                range.stream()
                     .reduce(0, (a, b) -> a + b);
        System.out.println(result);


    }
}
