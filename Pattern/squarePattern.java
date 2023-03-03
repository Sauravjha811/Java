package pattern;
import java.util.*;
public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        //pattern 1.
        while(i<=n)
        {
            int j=0;
            while(j<n)
            {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // pattern 2.
        i=1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        // pattern 3.
        i=1;
         while(i<=n)
        {
            int j=n;
            while(j>=1)
            {
                System.out.print(j);
                j--;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        //pattern 4
        i=1;
        while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				System.out.print(n);
				j++;
			}
			i++;
			System.out.println();
		}
    }
}
