package Arrays_Assignment1;
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class intersectionElements {
    public static void main(String[] args) {
        int arr[] = {6,8,5,4,3};
        int arr1[] = {2,3,4,7};
        commonElements(arr, arr1);
    }
    private static void commonElements(int arr[], int arr1[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j])
                {
                    System.out.print(arr1[j]+" ");
                    arr1[j]=Integer.MIN_VALUE;
                    break;
                }
            }
        }

    }
}
