package String_Java.Assignmnet_String;

public class revEachWord {
    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.print(revEachword(str));
    }
    private static String revEachword(String str)
    {
        //initialize an String to stores the ans.
        String ans ="";
        // calculate the length of the string.
        int n = str.length();
        if(n==0)
        return str;
        // initialize the prev to -1.
        int prev = -1;
        int i = 0;
        while(i<n)
        {
            if(str.charAt(i)==' ')
            {
                ans += revString(str,prev+1,i)+" ";
                prev = i;
            }
            i++;
        }
        ans += revString(str,prev+1,n);
        return ans;
    }
    private static String revString(String str, int start, int end)
    {
        String reverse ="";
        while(start<end){
            reverse = str.charAt(start)+reverse;
            start++;
        }
        return reverse;
    }
}
