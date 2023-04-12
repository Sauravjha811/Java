package DP_2;

public class waysCoinChange {
    public static void main(String[] args) {
        int deno[]={1,2,3};
        int values = 4;
        System.out.println(makeChange(deno, values));
    }
    private static int makeChange(int[] denominations, int value)
    {
        int[]dp = new int[value+1];
		dp[0]=1;
		for(int i=0;i<denominations.length;i++)
		{
			for(int j=0;j<=value;j++)
			{
				if(j>=denominations[i])
				{
					dp[j]=dp[j]+dp[j-denominations[i]];
				}
			}
		}
		return dp[value];
       /*  int n = deno.length;
        int ways[][] = new int[n][values+1];

        for(int i=0;i<n;i++)
        {
            ways[i][0] = 1;
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=values;j++)
            {
                int count1 = 0;
                if(i+1 <= n-1)
                {
                    count1 = ways[i+1][j];
                }
                int count2=0;
                if(j-deno[i]>=0)
                {
                    count2 = ways[i][j-deno[i]];
                }
                ways[i][j] = count1+count2;
            }
        }
        return ways[0][values];*/
    }
}
