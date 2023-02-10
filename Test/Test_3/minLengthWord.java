package Test_Java.Test_3;

public class minLengthWord {
    public static void main(String[] args) {
        String input = "this is test string";
        String str = minLength(input);
        System.out.println(str);
    }
    private static String minLength(String input)
    {
        int minStart=-1;// pointer need to store the minWord's index.
        int minLength=Integer.MAX_VALUE;// initialize the minLength with Max value.
        int currStart=0;// currStart helps us to calcualte the length of the word in the string.
        int i=0;
        for(;i<input.length();i++)
        {
            if(input.charAt(i)==' ')
            {
                int currentWordLength=i-currStart;
                if(currentWordLength<minLength)
                {
                    minStart=currStart;
                    minLength=currentWordLength;
                }
                currStart=i+1;
            }
        }
        if(minStart==-1)
        {
            return input;
        }
        else
        {
            // these codes for the last word, because there is no space in the last of the string.
            int currentWordLength=i-currStart;
            if(currentWordLength<minLength)
            {
                minStart = currStart;
                minLength = currentWordLength;
            }
            return input.substring(minStart, minStart+minLength);
        }
    }
}
