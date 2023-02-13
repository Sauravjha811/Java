package String_Java.Assignmnet_String;

public class remCharWord {
    public static void main(String[] args) {
        String str = "xxyyzxx";
        char ch = 'y';
        System.out.print(removeChar(str,ch));
    }
    private static String removeChar(String str, char ch)
    {
        int n = str.length();
        String ans = "";
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=ch)
            {
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
}
