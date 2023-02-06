package Test_Java.Test_2;
/*An urn contains 8 balls : 4 red , 2 blue and 2 green. Now n balls are drawn out of the urn. 
Calculate the probability that out of n drawn balls exactly x balls are red. */
import java.util.*;
public class probabilityRedBall {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int x=s.nextInt();
		System.out.println(probability(n,x));
    }
    private static double probability(int n, int x)
    {
        int ans = ncr(4,x)*ncr(4,n-x);
        float prob = ans * 1.0f/ncr(8,n);
        return (int) (prob*100);
    }
    private static int ncr(int n, int x)
    {
        int ans = (fact(n)/fact(n-x))/fact(x);
        return ans;
    }
    private static int fact(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans *=i;
        }
        return ans;
    }
}
