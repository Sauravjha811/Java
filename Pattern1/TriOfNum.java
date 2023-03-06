package Pattern_1;
import java.util.Scanner;
public class TriOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rows = 1;
        while(rows<=n)
        {
            // print the spaces of the pattern.
            int spaces = n-rows;
            while(spaces>=1)
            {
                System.out.print(" ");
                spaces--;
            }
            // print the Increasing Num of the pattern.
            int Inum = rows;
            int numP = rows;
            while(Inum>=1)
            {
                System.out.print(numP++);
                Inum--;
            }
            // Print the Decreasing Num of the pattern.
            int Dnum = rows-1;
            int numP1= 2*rows-2;
            while(Dnum>=1)
            {
                System.out.print(numP1--);
                Dnum--;
            }
            System.out.println();
            rows++;
        }
    }
}
