package com.mdw;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Read in each person: birth, death - into Person Array;
        //Create array for each year - deltas
        //increment and decrement for each year scanning list
        //find max year - keeping a running total
        int minYear = 100;
        int maxYear = -1;

        int[][] people = {{12,15},{20,90},{10,98},{23,82},{13,98},{90,98},{83,99},{75,94}};
        Person[] person = new Person[people.length];
        for(int i = 0 ; i < people.length; i++){
            Person p = new Person(people[i][0], people[i][1]);
            if(p.birth < minYear) {
                minYear = p.birth;
            }
            if(p.death > maxYear){
                maxYear = p.death;
            }
            person[i] = p;
            //System.out.println(p.birth + " " + p.death);
        }
        System.out.println(minYear + " " + maxYear);
        int[] years = getRunningTotal(person, minYear, maxYear);
        int max = 0;
        for(int i = 0; i < maxYear - minYear +2; i++){
            if(years[i] > max) max = years[i];

        }
        System.out.println(max +  minYear);

    }

    private static int[] getRunningTotal(Person[] person, int minYear, int maxYear) {
        int[] deltas = new int[maxYear - minYear + 2];

        for(Person p : person){

            for(int i = p.birth; i <= p.death + 1; i++){
                deltas[i - minYear]++;
            }

        }

        return deltas;

    }
}
