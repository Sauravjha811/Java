package Arrays_Assignment2;
import java.util.*;
public class sumOf2Array {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4};
        int arr2[] ={4,3,2,1};
        int arr[] = sumArray(arr1, arr2);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
    private static int[] sumArray(int []arr1, int []arr2)
    {
        int i=arr1.length-1;
        int j=arr2.length-1;
        int carry=0;
        int k=Math.max(arr1.length,arr2.length);
        int output[] = new int[k+1];

        while(i>=0 && j>=0)
        {
            int sum = arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        while(i>=0)
        {
            int sum = arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0)
        {
            int sum = arr2[j]+carry;
            output[k]=sum%10;
            carry=carry/10;
            j--;
            k--;
        }
        return output;
    }
}
