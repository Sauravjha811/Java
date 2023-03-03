package pattern;
import java.util.*;
public class TriangularPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Pattern 1
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // pattern-2
        i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        i=1;
        while(i<=n)
        {
            int j=i;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
    }
}
