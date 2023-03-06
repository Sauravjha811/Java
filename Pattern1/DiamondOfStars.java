package Pattern_1;
import java.util.Scanner;
public class DiamondOfStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // first half of the pattern.
        int n1 = (n+1)/2;
        int rows = 1;
        while(rows<=n1)
        {
            // print the spaces of the pattern.
            int spaces = n1-rows;
            while(spaces>=1)
            {
                System.out.print(" ");
                spaces--;
            }
            // print the stars of the pattern.
            int star = 2*rows-1;
            while(star>=1)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            rows++;
        }
        // second half of the pattern.
        int n2=(n/2);
        int rows2=n2;
        while(rows2>=1)
        {
            // print the spaces of the pattern.
            int spaces = n2-rows2+1;
            while(spaces>=1)
            {
                System.out.print(" ");
                spaces--;
            }
            // print the star of the pattern.
            int star = 2*rows2-1;
            while(star>=1)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            rows2--;
        }
    }
}
