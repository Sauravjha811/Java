package String_Java;

public class printCharString {
    public static void main(String[] args) {
        String str = "Devta Devi";
        printChar(str);
    }
    private static void printChar(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}
