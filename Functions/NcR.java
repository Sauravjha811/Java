package Functions_Java;
import java.util.Scanner;
public class NcR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(ncr(n,r));
    }
    private static int ncr(int n ,int r)
    {
        int factN = fact(n);
        int factR = fact(r);
        int factNR = fact(n-r);
        int result = factN/(factR*factNR);
        return result;
    }
    private static int fact(int f)
    {
        int result = 1;
        for(int i=2;i<=f;i++)
        {
            result*=i;
        }
        return result;
    }
}
