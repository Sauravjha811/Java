package Recursion_Java;
import java.util.Scanner;
public class factRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Factorial Number:");
        int n = sc.nextInt();
        System.out.println("The factorial of the "+ n+" is:-"+factUsingRecursive(n));
    }
    public static int factUsingRecursive(int n)
    {
        // base case
        if(n==0)
        {
            return 1;
        }
        return n*factUsingRecursive(n-1);
    }
}
