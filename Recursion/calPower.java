package Recursion_Java;
import java.util.Scanner;
public class calPower {
    public static void main(String[] args) {
        int base, exponent;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base:-");
        base = sc.nextInt();
        System.out.println("Enter the Exponent:-");
        exponent = sc.nextInt();
        System.out.println(power(base, exponent));
    }
    private static int power(int base, int exponent){
        if(exponent==0){
            return 1;
        }
        return base*power(base,exponent-1);
    }
}
