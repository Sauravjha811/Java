package Recursion_3;

public class printMinArray {
    public static void main(String[] args) {
        int arr[] = {5,3,1,7,9,6,20};
        printMin(arr,0,Integer.MAX_VALUE);
    }
    private static void printMin(int[] arr, int start, int minValue)
    {
        if(start == arr.length)
        {
            System.out.println(minValue);
            return;
        }
        if(arr[start]<minValue)
        {
            minValue = arr[start];
        }
        printMin(arr,start+1,minValue);
    }

}
