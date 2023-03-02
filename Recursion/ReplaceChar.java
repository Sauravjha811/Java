package Recursion_Java;

public class ReplaceChar {
    public static void main(String[] args) {
        String s = "Saurav Kumar Jha";
        String r = replaceChar(s, 'a', 'j');
        System.out.print(r);
    }
    public static String replaceChar(String s, char a, char b)
    {
        // base condition if string length equals to zero return string.
       if(s.length()==0)
       {
        return "";
       }
       if(s.charAt(0)==a)
       {
        return b+replaceChar(s.substring(1),a,b);
       }
       else
       {
        return s.charAt(0)+replaceChar(s.substring(1),a,b);
       }
    }
}
