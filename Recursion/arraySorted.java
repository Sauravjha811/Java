package Recursion_Java;
import java.util.*;
public class arraySorted {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(isSorted(arr,0));
    }
    private static boolean isSorted(int a[],int startIndex)
    {
        if(a.length-1==startIndex)
        {
            return true;
        }
        if(a[startIndex]>a[startIndex+1])
        {
            return false;
        }
        boolean isSmallSorted = isSorted(a,startIndex+1);
        return isSmallSorted;
    }

   /*  private static boolean isSorted(int a[])
    {
        if(a.length==1)
        {
            return true;
        }
        if(a[0]>a[1])
        {
            return false;
        }
        int smallArr[] = new int[a.length-1];
        for(int i=1;i<a.length;i++)
        {
            smallArr[i-1] = a[i];
        }
        boolean isSmallArrSorted = isSorted(smallArr);
        return isSmallArrSorted;
    }*/
}
