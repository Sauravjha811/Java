package Arrays_Assignment2;

public class secondLargest {
    public static void main(String[] args) {
        int []arr={2,13,4,1,3,6,28};
        System.out.print("Second Largest Element in the Array is: "+Second(arr));
    }
    private static int Second(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        int maxSec = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                // stores the max values in the Maxsec.
                maxSec=max;
                max=arr[i];
            }
        }
        return maxSec;
    }
}
