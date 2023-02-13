package String_Java.Assignmnet_String;

public class highestOccurChar {
    public static void main(String[] args) {
        String str ="Saurav kumar jha";
        System.out.print(highestOccur(str));
    }
    private static char highestOccur(String str)
    {
        int n = str.length();
        int freq[] = new int[256];
        int maxFreq = 0;
        
        for(int i=0;i<n;i++)
        {
            freq[str.charAt(i)]++;
            maxFreq=Math.max(maxFreq,freq[str.charAt(i)]);
        }
        char ans = '\0';

        for(int i=0;i<n;i++)
        {
            if(freq[str.charAt(i)]==maxFreq)
            {
                ans=str.charAt(i);
                break;
            }
        }
        return ans;
    }
}
