package Recursion_3;
import java.util.Scanner;
public class keyPad {
    public static void main(String[] args) {
        System.out.println("Enter the Number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] output = keyPad(n);
        for(String element: output){
            System.out.print(element+" ");
        }  
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
    private static String[] keyPad(int n){
        if(n == 0){
            String output[] = {""};
            return output;
        }
        String smallNumberArray[] = keyPad(n/10);
        String singleDigitOutput[] = singleDigit(n%10);

        String output[] = new String[smallNumberArray.length * singleDigitOutput.length];
        int k = 0;
        for(int a=0;a<singleDigitOutput.length;a++){
            for(int i=0;i<smallNumberArray.length;i++){
                output[k] = smallNumberArray[i]+singleDigitOutput[a];
                k++;
            }
        }
        return output;
    }
}
