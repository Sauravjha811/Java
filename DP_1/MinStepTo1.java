package DP_1;
import java.util.Scanner;
public class MinStepTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countMinStepTo1(n));
    }
    // Brute-Force approach to count MinSteps To 1.
    private static int countMinStepTo1(int n)
    {
        if(n==1){
            return 0;
        }
        int subtractByOne = Integer.MAX_VALUE;
        int divideByTwo = Integer.MAX_VALUE;
        int divideByThree = Integer.MAX_VALUE;

        subtractByOne = countMinStepTo1(n-1);
        if(n%2 == 0){
            divideByTwo = countMinStepTo1(n/2);
        }
        if(n%3 == 0){
            divideByThree = countMinStepTo1(n/3);
        }
        return 1+Math.min(subtractByOne,Math.min(divideByTwo, divideByThree));
    }
}
