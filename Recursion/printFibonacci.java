package Recursion_Java;
import java.util.*;
public class printFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fibonacci(n));
    }
    private static int fibonacci(int n)
    {
        if(n==1 || n==2){
            return 1;
        }
         return fibonacci(n-1)+fibonacci(n-2);
    }
}
