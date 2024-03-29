package Recursion_3;
import java.util.Scanner;
public class printKeyPad {
    public static void main(String[] args) {
        System.out.println("Enter the Number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        keyPadPrint(n,""); 
    }
    private static String[] singleDigit(int n){
        if(n <=1 || n>10){
            System.exit(0);
        }
        if(n == 2){
            String[] output = {"a","b","c"};
            return output;
        }
        else if(n == 3){
            String[] output = {"d","e","f"};
            return output;
        }
        else if( n == 4){
            String[] output = {"g","h","i"};
            return output;
        }
        else if( n == 5){
            String[] output = {"j","k","l"};
            return output;
        }
        else if(n == 6){
            String[] output = {"m","n","o"};
            return output;
        }
        else if(n== 7){
            String[] output = {"p","q","r","s"};
            return output;
        }
        else if(n == 8){
            String[] output = {"t","u","v"};
            return output;
        }
        else {
            String[] output = {"w","x","y","z"};
            return output;
        }
    }
    private static void keyPadPrint(int input, String output)
    {
        if(input == 0){
            System.out.println(output);
            return;
        }
        String singleDigitOutput[] = singleDigit(input%10);

        for(int i=0;i<singleDigitOutput.length;i++)
        {
            keyPadPrint(input/10,singleDigitOutput[i]+output);
        }
    }
}
