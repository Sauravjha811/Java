package DP_1;
import java.util.Scanner;
public class MinNumSquares {
    public static void main(String[] args) {
        int n = 24;
        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++) {
            dp[i] = -1;
        }
        int ans = minCount(n);
        System.out.println(ans);
    }
    private static int minSquares(int n, int dp[])
    {
        if(n == 0){
            return 0;
        }
        int minAns = Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int currAns;
            if(dp[n-(i*i)] == -1)
            {
                currAns = minSquares(n-(i*i),dp);
                dp[n-(i*i)] = currAns;
            }
            else {
                currAns = dp[n-(i*i)];
            }
            if(minAns > currAns)
            {
                minAns = currAns;
            }
        }
        return minAns+1;
    }
    private static int minCount(int n){
        int minSquaresRequired[] = new int[n+1];
        minSquaresRequired[0] = 0;
        minSquaresRequired[1] = 1;

        for(int i=2;i<=n;i++)
        {
            minSquaresRequired[i] = Integer.MAX_VALUE;
            for(int j=1;i-(j*j)>=0;++j){
                minSquaresRequired[i] = Math.min(minSquaresRequired[i],minSquaresRequired[i-(j*j)]);
            }
            minSquaresRequired[i]+=1;
        }
        return minSquaresRequired[n];
    }
}
