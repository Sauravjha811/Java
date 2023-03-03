package pattern;
import java.util.*;
public class CharPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        // pattern 1
        while(i<=n)
        {
            int j=0;
            while(j<n)
            {
               // char jth = (char) ('A'+j);
                System.out.print((char) ('A'+j));
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // pattern 2
        i=1;
        while(i<=n)
        {
            int j=0;
            while(j<i)
            {
               // char jth = (char) ('A'+j);
                System.out.print((char) ('A'+i-1));
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // pattern 3
        i=0;
        while(i<n)
        {
            char s = (char)('A'+i);
            int j=0;
            while(j<n)
            {
               // char jth = (char) ('A'+j);
                System.out.print((char) (s+j));
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
