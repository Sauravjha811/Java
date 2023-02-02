package Arrays_Problem_Java;
import java.util.*;
public class Arrange_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        arrange(arr,n);   
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        } 
    }
    // these method print the array's element 1 3 5....6 4 2
    public static void arrange(int[] arr, int n) {
        int k=1;
        // i start from 0, j start end index.
        // i traverse through i<=k
       for(int i=0, j=n-1;i<=j;i++,j--)
       {
        // These condition for the odd case.
           if(i==k)
           {
               arr[i]=k;
               return;
           }
          arr[i]=k++;
          arr[j]=k++;
       }
}
}
