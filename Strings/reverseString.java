package String_Java;

public class reverseString {
    public static void main(String[] args) {
        String str = "Saurav";
        System.out.println(reverse(str));
    }
    private static String reverse(String str)
    {
        String rev="";
        //for(int i=str.length()-1;i>=0;i--)
        //{
        //   rev += str.charAt(i);
        //}
        //return rev;
        for(int i=0;i<str.length();i++)
        {
            rev = str.charAt(i)+rev;
        }
        return rev;
    }
}
