package DP_2;

public class KnapSack {
    public static void main(String[] args) {
        int n = 4;
        int weights[] = {1,2,4,5};
        int values[] = {5,4,8,6};
        int maxWeight = 5;
        System.out.println(knapsack(weights, values, n, maxWeight));
    }
    private static int knapsack(int[] weights, int[] values, int n, int maxWeight)
    {

        if(n==0 || maxWeight==0){
            return 0;
        }
        if(weights[n-1]>maxWeight){
            return knapsack(weights, values, n-1, maxWeight);
        }
        int includeItem = values[n-1] + knapsack(weights, values, n-1, maxWeight-weights[n-1]);
        int excludeItem = knapsack(weights, values, n-1, maxWeight);

        return Math.max(includeItem, excludeItem);
    }
}
