package pattern;
import java.util.Scanner;
public class CharPattern1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int i=0;
    // Pattern-1
    while(i<n)
    {
        char s = (char) ('A'+i);
        int j=0;
        while(j<=i)
        {
           System.out.print((char) (s+j));
           j++;
        }
        System.out.println();
        i++;
    }
    System.out.println();
    // Pattern-2
    i=0;
    while(i<=n)
    {
        int j=0;
        char num = (char)('A'+n-i);
        while(j<i)
        {
           System.out.print((char)(num+j));
           //num++;
           j++;
        }
        System.out.println();
        i++;
    }
}
}
