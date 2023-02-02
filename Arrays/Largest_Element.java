package Arrays_Problem_Java;
import java.util.*;
public class Largest_Element {
    // Method to Print an Array.
    public static void printArray(int[]arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    // Method to take input from the user.
    public static int[] takeInput(){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th index");
            arr[i]=s.nextInt();
        }
        return arr;  
    }
    //Method to find largest element.
    public static int largest(int arr[]){
        // initialize the max variable with Minimum value.
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    // Method to print largest Element where is present in the Array.
    public static int largestPos(int arr[]){
        int max=Integer.MIN_VALUE;
        int pos=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                //max=arr[i];
                pos=i;
            }
        }
        return pos;
    }
    public static void main(String args[]) {
        int[] arr=takeInput();
        System.out.println("Largest Element in Array is: "+largest(arr));
        System.out.println("Largest Element Position is: "+largestPos(arr));
   }
}

