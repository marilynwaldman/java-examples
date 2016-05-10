import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                int strlength = s1.length(); 
                if( strlength <0 || strlength >10 ){
                    System.exit(0);
                }
                if(x < 0 || x > 999){
                    System.exit(0);
                }
                
                String mystring = String.valueOf(x);
                String str2 = String.format("%3s", mystring).replace(' ', '0');
                System.out.printf("%-15s%3s\n",s1,str2);
                //System.out.println("'%-15s%-02d'", s1,x);
                //Complete this line
            }
            System.out.println("================================");

    }
}

