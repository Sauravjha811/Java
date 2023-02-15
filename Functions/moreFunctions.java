package Functions_Java;
import java.util.*;
public class moreFunctions {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();
     double c = sc.nextDouble();
     int ans1 = sum(a,b);
     System.out.println(ans1);
     double ans2 = sum(a,b,c);
     System.out.println(ans2);
     printEvenNumbers(a,b);
    }
    public static int sum(int a, int b)
    {
        int ans = a+b;
        return ans;
    }
    public static double sum(int a, int b,double c)
    {
       double ans = a+b+c;
       return ans;
    }
    public static void printEvenNumbers(int start, int end)
    {
        if(start%2!=0)
        {
            start++;
        }
        for(int i=start;i<=end;i+=2)
        {
            System.out.println(i);
        }
    }

}
