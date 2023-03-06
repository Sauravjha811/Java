package Pattern_1;
import java.util.Scanner;
public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while(i<=n)
        {
            // print the spaces of the pattern.
            int spaces=n-i;
            while(spaces>=1)
            {
                System.out.print(" ");
                spaces--;
            }
            // print the increaseing part of the pattern.
            int inum=1;
            while(inum<=i)
            {
                System.out.print(inum);
                inum++;
            }
            // print the decreasing part of the pattern
            int dnum=i-1;
            while(dnum>=1)
            {
                System.out.print(dnum);
                dnum--;
            }
            System.out.println();
            i++;
        }
    }
}
