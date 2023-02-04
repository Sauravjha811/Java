package Test_Java.Test_1;
import java.util.Scanner;
public class numberStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        starPattern(n);
    }
    static void starPattern(int n)
    {
        // first loops traverse through 1 to n.
        for(int i=1;i<=n;i++)
        {
            // second loops traverse through n to 1.
            for(int j=n;j>0;j--)
            {
            // i equals to j, then print *;
            // otherwise print j.
              if(i==j)
              {
                System.out.print("*");
                continue;
              }
              System.out.print(j);
            }
            System.out.println();
        }
    }
}
