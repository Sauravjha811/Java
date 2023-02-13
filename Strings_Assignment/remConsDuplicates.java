package String_Java.Assignmnet_String;

public class remConsDuplicates {
    public static void main(String[] args) {
        String str = "aabccbaa";
        System.out.print(removeCons(str));
    }
    private static String removeCons(String str)
    {
    int n = str.length();
    if(n==0)
    {
        return str;
    }
    String ans="";
    int startIndex=0;
    while(startIndex<n)
    {
        char uniqueChar = str.charAt(startIndex);
        int nextUniqueCharIndex = startIndex+1;

        while(nextUniqueCharIndex<n && str.charAt(nextUniqueCharIndex)==uniqueChar)
        {
            nextUniqueCharIndex+=1;
        }
        ans+=uniqueChar;
        startIndex = nextUniqueCharIndex;
    }
    return ans;
    }
}
