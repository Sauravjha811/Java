package String_Java;

public class revStringWordWise {
    public static void main(String[] args) {
        String str = "Always indent your code";
        System.out.println(reverseStringWord(str));
    }
    private static String reverseStringWord(String str)
    {
        int end = str.length();
        int i=str.length()-1;
        String output="";

        while(i>=0)
        {
            if(str.charAt(i)==' ')
            {
                output+=str.substring(i+1,end)+" ";
                end=i;
            }
            i--;
        }
        output+=str.substring(i+1,end);
        return output;
    }
}
