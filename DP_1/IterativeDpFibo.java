package DP_1;

public class IterativeDpFibo {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibb1(n));
    }
    public static int fibb1(int n) {
        if(n==0 || n==1){
            return n;
    }
    int [] dp = new int[n+1];
    dp[0]=0;
    dp[1]=1;
    // if n>=2
    for(int i=2;i<=n;i++)
    {
        dp[i] = dp[i-1]+dp[i-2];
    }
    return dp[n];
}
}
