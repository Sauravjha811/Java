package pattern;
import java.util.Scanner;
public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Pattern 1.
        int i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
        System.out.println();
        i++;
        }
        System.out.println();

        // pattern 2
        i=1;
        int Num=1;
        while(i<=n)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print(Num);
                Num++;
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        
        // Pattern 3
        i=1;
        while(i<=n)
        {
            int j=1;
            int num=i;
            while(j<=i)
            {
                System.out.print(num);
                j++;
                num++;
            }
            i++;
            System.out.println();
        }
    }
}
