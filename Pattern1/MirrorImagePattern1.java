package Pattern_1;

import java.util.*;

public class MirrorImagePattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            // Printing Spaces in the pattern.
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces++;
            }

            // Printing the star in the pattern
            int Number = 1;
            while (Number <= i) {
                System.out.print(Number);
                Number++;
            }
            i++;
            System.out.println();
        }
    }
}
