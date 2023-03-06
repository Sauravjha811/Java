package Pattern_1;
import java.util.Scanner;
public class HalfDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("*");
        // First half of the pattern.
        int rows=1;
        while(rows<=n)
        {
            System.out.print("*");
            // increasing num.
            int num=1;
            int Pnum=rows;
            while(Pnum>=1)
            {
               System.out.print(num++);
               Pnum--;
            }
            // Decreasing Num.
            int Pnum1=rows-1;
            while(Pnum1>=1)
            {
                System.out.print(Pnum1--);
            }
            System.out.println("*");
            rows++;
        }
        // Second half of the pattern.
        int rows1=n-1;
        while(rows1>=1)
        {
            System.out.print("*");

            // increasing part
            int Pnum = rows1;
            int num=1;
            while(Pnum>=1)
            {
                System.out.print(num++);
                Pnum--;
            }
            // Decresing part.
            int Pnum1=rows1-1;
            while(Pnum1>=1)
            {
                System.out.print(Pnum1--);
            }
            System.out.println("*");
            rows1--;
        }
        System.out.println("*");
    }
}
