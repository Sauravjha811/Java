package Pattern_1;
import java.util.Scanner;
public class MirrorImagePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;

        while(i<=n)
        {
            // Printing Spaces in the pattern.
             int spaces=1;
             while(spaces<=n-i)
             {
                System.out.print(" ");
                spaces++;
             }

             // Printing the star in the pattern
             int star=1;
             while(star<=i)
             {
                System.out.print("*");
                star++;
             }
             i++;
             System.out.println();
        }

    }
}
