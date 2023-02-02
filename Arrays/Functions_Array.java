package Arrays_Problem_Java;
import java.util.*;
public class Functions_Array {
    //Function or Method to print an Array.
    public static void printArray(int[]arr){
        int n=arr.length;// also used directly arr.length in the conditional statement.
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    // Function or Method to Take input in Array.
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
    public static void main(String args[]) {
     int[] arr=takeInput();
     printArray(arr);
    }
}
