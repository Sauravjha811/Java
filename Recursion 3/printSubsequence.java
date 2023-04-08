package Recursion_3;

public class printSubsequence {
    public static void main(String[] args) {
        String input = "abc";
        printSub(input,"");
    }
    private static void printSub(String input, String stringSoFar)
    {
        if(input.length()==0){
            System.out.println(stringSoFar);
            return;
        }
        String smallInput = input.substring(1);
        printSub(smallInput, stringSoFar);
        printSub(smallInput, stringSoFar+input.charAt(0));
    }
}
