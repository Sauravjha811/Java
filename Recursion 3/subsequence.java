package Recursion_3;
import java.util.Scanner;
public class subsequence {
    public static void main(String[] args) {
        System.out.println("Enter the String:-");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output[] = subsequence(input);
        for(String element: output){
            System.out.print(element+" ");
        }
    }
    private static String[] subsequence(String input){
        // base case
        if(input.length()==0)
        {
            String output[] = new String[1];
            output[0] = "";
            return output;
        }
        String smalloutput[] = subsequence(input.substring(1));
        String output[] = new String[smalloutput.length*2];
        for(int i=0;i<smalloutput.length;i++){
            output[i] = smalloutput[i];
        }
        for(int i=0;i<smalloutput.length;i++){
            output[smalloutput.length+i] = input.charAt(0)+smalloutput[i];
        }
    return output;
    }
}
