package Test_Java.Test_2;
import java.util.Scanner;
public class maximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Maximum(n));
    }
    private static int Maximum(int n)
    {
        int maxNum = 0;
        int i=1;
        
        while(n/i>0)
        {
            int newNum = (n/(i*10))*i+n%i;
            System.out.println(newNum);
            i=i*10;
            if(maxNum<newNum)
            maxNum=newNum;
        }
        return maxNum;
    }
}
