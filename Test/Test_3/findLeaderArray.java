package Test_Java.Test_3;

public class findLeaderArray {
    public static void main(String[] args) {
        int arr[] = {3,12,34,2,0,-1};
       // int arr1[] = {13,17,5,4,6};
        leaderRight(arr);
        System.out.println();
        leaderLeft(arr);
    }
    private static void leaderLeft(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }
    private static void leaderRight(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                System.out.print(arr[i]+" ");
                max=arr[i];
            }
        }
    }
}
