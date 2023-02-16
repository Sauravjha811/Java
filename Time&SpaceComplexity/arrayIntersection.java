package Time_Complexity_Java;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class arrayIntersection {
    public static void main(String[] args) {
        //int arr1[] = {2,6,1,2};
       // int arr2[] = {1,2,3,4,2};
        int arr1[] = {2,6,8,5,4,3,7};
        int arr2[] = {2,3,4,7};
        interSectionOptimized(arr1, arr2);
    }
    // time complexity of these algorithm will be O(N*M)
    private static void intersection(int arr1[], int arr2[])
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                 System.out.print(arr1[i]+" ");
                 break;
                }
            }
        }
    }

    private static void interSectionOptimized(int arr1[], int arr2[])
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]>arr2[j])
            {
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else 
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
