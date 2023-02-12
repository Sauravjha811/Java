package String_Java;

public class revEachWord {
    public static void main(String[] args) {
       //String input = "abc def ghi";
       String input = "Saurav Kumar jha";
       System.out.println(reverseWord(input)); 
    }
    private static String reverseWord(String input)
    {
        String ans="";
        int currWordStart=0;
        int i=0;
        for(;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                int currWordEnd=i-1;
                String revWord="";

                for(int j=currWordEnd;j>=currWordStart;j--)
                {
                   revWord+=input.charAt(j);
                }
                // Add it final String(ans).
                ans+=revWord+" ";
                currWordStart=i+1;
            }
        }
        int currWordEnd=i-1;
        String revWord="";

        for(int j=currWordEnd;j>=currWordStart;j--)
        {
           revWord+=input.charAt(j);
        }
        // Add it final String(ans).
        ans+=revWord;
    return ans;
    }
}
