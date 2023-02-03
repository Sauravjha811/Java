package Arrays_Assignment1;

import java.util.*;

public class findUnique {
    public static void main(String[] args) {
        // int arr[] ={2,3,1,6,3,6,2};// 1 is unique
        int arr[] = { 2, 2, 3, 5,4, 3,5,6,6 };// 2 is unique
       // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //System.out.println(uniqueBetter(arr));
        System.out.println(uniqueBest(arr));

    }
    // Approach 3rd takes O(n) times.
    private static int uniqueBest(int arr[]){
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res^arr[i];
        }
        return res;
    }
    //Approach 2nd takes O(n logn) because we need sorted Array,
    private static int uniqueBetter(int[] arr){
       int i=0;
       while(i<arr.length-1 && arr[i]==arr[i+1])
       i+=2;
       return arr[i];
    }
    // Approcah 1st takes O(n2), not good.
    private static int unique(int[] arr) {
        // initialize the unique variable -1
        int unique = -1;
        // traverse the loops
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            // using another loops, for counting the same elements.
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    continue;
                else if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1) {
                unique = i;
                break;
            }
        }
        return arr[unique];
    }

}
