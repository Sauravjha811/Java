package Recursion_3;

public class printFactorial {
    public static void main(String[] args) {
        System.out.println("Enter the Number:-");
        int n = 10;
        factorial(n,1);
    }
    private static void factorial(int n,int answer)
    {
        if( n == 0){
            System.out.println(answer);
            return;
        }
        answer = answer*n;
        factorial(n-1, answer);
    }
}
