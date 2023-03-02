package Recursion_Java;
import java.util.Scanner;
public class sumNnaturalNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of Number:-"+sumN(n));
        
    }
    public static int sumN(int n)
    {
        if(n==0)
        {
            return n;
        }
        return n+sumN(n-1);
    }
    
    }
   
