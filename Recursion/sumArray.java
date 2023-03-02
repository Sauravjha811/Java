package Recursion_Java;
import java.util.*;
public class sumArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(sumElement(arr,0));
    }
    private static int sumElement(int [] arr, int startIndex)
    {
        if(arr.length-1==startIndex)
        {
            return arr[startIndex];
        }
        int ans = arr[startIndex]+sumElement(arr, startIndex+1);
        return ans;
    }

}
