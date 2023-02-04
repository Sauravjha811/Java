package Test_Java.Test_1;
import java.util.Scanner;
public class palindromeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        System.out.println(n+" is palindrome "+isPalindrom(n));
    }
    private static boolean isPalindrom(int num)
    {
       int temp=num, revNum=0;
       while(temp>0){
        int lastDigit = temp%10;
        temp/=10;
        revNum=revNum*10+lastDigit;
       }
       if(num==revNum)
       {
        return true;
       }
       else{
        return false;
       }
    }
}
