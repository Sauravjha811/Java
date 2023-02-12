package String_Java;

public class isPalindrome {
    public static void main(String[] args) {
        String str = "abcdtcba";
        System.out.println(str+" is palindrome:-"+checkPalindrome(str));
    }
    private static boolean checkPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
              return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
