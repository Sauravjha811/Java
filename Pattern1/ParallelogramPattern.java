package Pattern_1;
import java.util.Scanner;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = 1;

        while(rows<=n)
        {
            // print Spaces in the pattern.
            int spaces = rows-1;
            while(spaces>=1)
            {
                System.out.print(" ");
                spaces--;
            }
            // print star in the pattern.
            int star=n;
            while(star>=1)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            rows++;
        }
    }
}
