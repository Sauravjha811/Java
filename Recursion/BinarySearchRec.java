package Recursion_Java;

import javax.lang.model.util.ElementScanner6;

public class BinarySearchRec {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key = 6;
        System.out.println(binarySearch(arr,0,arr.length-1,key));
    }
    private static int binarySearch(int[] arr,int startIndex, int endIndex,int key)
    {
        if(startIndex>endIndex)
        {
            return -1;
        }
        int mid = (startIndex+endIndex)/2;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(arr[mid]<key){
            return binarySearch(arr,mid+1,endIndex,key);
        }else{
            return binarySearch(arr,startIndex,mid-1,key);
        }
    }
}
