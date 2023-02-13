package String_Java.Assignmnet_String;

public class compressString {
    public static void main(String[] args) {
        String input = "aaabbcddeeeee";
        System.out.println(compress(input));
    }
    private static String compress(String input)
    {
        if(input == null)
        {
            return null;
        }
        if(input.length()==0)
        {
            return "";
        }
        int startIndex = 0;
        int endIndex = 0;
        String compressed = "";

        while(startIndex < input.length())
        {
            while((endIndex <input.length()) && (input.charAt(endIndex)==input.charAt(startIndex)))
            {
                endIndex+=1;
            }
            int totalCount = endIndex - startIndex;
            if(totalCount!=1)
            {
                compressed +=(input.charAt(startIndex)+""+totalCount);
            }
            else
            {
                compressed +=input.charAt(startIndex);
            }
            startIndex=endIndex;
        }
        return compressed;
    }
}
