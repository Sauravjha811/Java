package Arrays2_java;

import java.util.*;

import javax.lang.model.util.ElementScanner6;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 5, 9, 8, 2, 3, 8, 7, 6, 3, 12 };
        int key = 15;
        System.out.println(binarySer(arr,key));
    }

    private static int binarySer(int[] arr, int key) {
        Arrays.sort(arr);// binarysearch we need a sorted arrays.
        int start = 0;
        int end = arr.length - 1;
        while(start<=end)
        {
            // find the mid index
            int mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(arr[mid]>key)
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
      return -1;
    }
}
