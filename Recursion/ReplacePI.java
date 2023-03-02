package Recursion_Java;

public class ReplacePI {
    public static void main(String[] args) {
        String s = "apiapipipiip";
        System.out.println(replaceValue(s));
    }
    private static String replaceValue(String s)
    {
        if(s.length()<=1)
        return s;
        
        if(s.charAt(0)=='p' && s.charAt(1)=='i')
        {
            return ("3.14" + replaceValue(s.substring(2)));
        }
        return s.charAt(0) + replaceValue(s.substring(1));
    }
}
