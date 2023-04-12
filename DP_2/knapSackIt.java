package DP_2;

public class knapSackIt {
    public static void main(String[] args) {
        int n = 4;
        int weights[] = {1,2,4,5};
        int values[] = {5,4,8,6};
        int maxWeight = 5;
        System.out.println(knapsack(weights, values, n, maxWeight));
    }
    private static int knapsack(int[] weights, int[] values, int n, int maxWeight)
    {

       int[][] dp = new int[n+1][maxWeight+1];

       for(int i=n-1;i>=0;i--)
       {
        for(int w=0;w<=maxWeight;w++)
        {
            if(weights[i] <=w)
            {
               int ans1 = dp[i+1][w];
               int ans2 = dp[i+1][w-weights[i]]+values[i];
               dp[i][w] = Math.max(ans1,ans2);
            }
            else
            {
                dp[i][w] = dp[i+1][w];
            }
        }
       }
       return dp[0][maxWeight];
    }
}
