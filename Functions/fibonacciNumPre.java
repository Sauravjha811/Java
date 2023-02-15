package Functions_Java;
import java.util.*;
public class fibonacciNumPre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPresent(n));
    }
    private static boolean isPresent(int n)
    {
        int a=0;
        int b=1;
        while(a<n)
        {
            int c = a+b;
            a = b;
            b = c;
        }
        if(a==n)
        return true;
        else
         return false;
    }
}
