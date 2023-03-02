package Recursion_Java;
import java.util.Scanner;
public class numberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digit in the Entered Number is:-"+ nDigit(n));
    }
    private static int nDigit(int n)
    {
        if(n<=0){
            return 0;
        }
        return 1+nDigit(n/10);
    }
}
