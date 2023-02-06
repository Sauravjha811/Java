package Test_Java.Test_2;

/*1234554321
1234**4321
123****321
12******21
1********1*/
import java.util.Scanner;

import javafx.print.PrintColor;

public class numberStarPattern {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printPattern(n,0);
        }
    }

    private static void printPattern(int n,int numStars) {
        // these loops traverse the rows of the pattern.
        for (int i = 0; i < n; i++) {
            // these loops print the increaseing number from 1 to n-i.
            for (int value = 1; value <= n - i; value++) {
                System.out.print(value);
            }
            // these loops print the star.
            for( int stars=1;stars<=numStars;stars++)
            {
                System.out.print("*");
            }
            // these loops print the value(n-i) in the decreasing order.
            for(int value=n-i;value>0;value--)
            {
                System.out.print(value);
            }
            numStars+=2;
            System.out.println();
        }
    }
}
