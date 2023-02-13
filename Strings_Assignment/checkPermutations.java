package String_Java.Assignmnet_String;

public class checkPermutations {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "baedc";
        int asciiCode = str1.charAt(1);
        System.out.println(asciiCode);
        System.out.println(checkPer(str1,str2));
        
    }
    private static boolean checkPer(String str1, String str2)
    {
        if(str1.length()!=str2.length())
        return false;

        int frequency[] = new int[256];

        for(int i=0;i<str1.length();i++)
        {
            int asciiCode = str1.charAt(i);
            frequency[asciiCode]= frequency[asciiCode]+1;
        }
        for(int i=0;i<str2.length();i++)
        {
           int asciiCode = str2.charAt(i);
           frequency[asciiCode]=frequency[asciiCode]-1;
        }
        for(int element:frequency)
        {
            if(element!=0)
            return false;
        }
        return true;
    }
}
