package Arrays_Problem_Java;
import java.util.*;
public class Taking_in_print_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements in the Array:");
        int n = sc.nextInt();
        int[] arr=new int[n];
        // Using loop taking input from the user.
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th index: ");
            arr[i]=sc.nextInt();
        }
        // Using loop printing the User's entered Array.
        System.out.println("Print the Array:-");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
}
}
