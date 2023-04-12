package DP_1;
import java.util.Scanner;
public class StairCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the StairCase Steps:-");
        int n = sc.nextInt();
        System.out.println(nWays(n));
    }
    private static long nWays(int n)
    {
        long[] ways = new long[n+1];
        // this is our DP array/list of size(n+1)
        
        // Base case
        if(n==0||n==1 || n==2){
            return n;
        }
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;

        for(int i=3;i<=n;i++){
            ways[i] = ways[i-1]+ways[i-2]+ways[i-3];
        }
        return ways[n];
    }
}
