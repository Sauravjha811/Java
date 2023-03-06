package Pattern_1;
import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while(row<=n)
        {
            // print the Spaces part of the pattern
            int spaces = n-row;
            while(spaces>=1)
            {
                System.out.print(" ");
                spaces--;
            }
            // print the star part of the pattern.
            int star = 2*(row-1)+1;
            while(star>0)
            {
                System.out.print("*");
                star--;
            }
            System.out.println();
            row++;
        }
    }
}
