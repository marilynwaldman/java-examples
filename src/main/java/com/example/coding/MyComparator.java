// Write your Checker class here
import java.util.*;
import java.io.*;
   
class Checker implements Comparator<Player>
    {            
         public int compare(Player p1, Player p2)
         {
             String n1 = p1.name;
             String n2 = p2.name;
             if(p1.score < p2.score){
                 return 1;
             }
             else if(p2.score < p1.score){
                 return -1;
             }
             else{
                 return n1.compareTo(n2);
             }
         }
  }

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class MyComparator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player player[] = new Player[n];
        Checker checker = new Checker();

        for(int i=0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}