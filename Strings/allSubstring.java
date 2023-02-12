package String_Java;

public class allSubstring {
    public static void main(String[] args) {
        String str = "abc";
        subString(str);
        subString1(str);
    }
    // p pq pqr pqrs 
    private static void subString(String str)
    {
        // using subString.
       /*  for(int start=0;start<str.length();start++)
        {
            for(int end=i;end<str.length();end++)
            {
                System.out.print(str.substring(start,end+1)+" ");
            }
        }*/
        for(int start=0;start<str.length();start++)
        {
            for(int end=start;end<str.length();end++)
            {
                for(int k=start;k<=end;k++)
                {
                    System.out.print(str.charAt(k));
                }
                System.out.print(" ");
            }
        }
    }
    // p q r s pq
    private static void subString1(String str)
    {
        for(int len=1;len<=str.length();len++){
        // print all string with length as "len";
        for(int start=0;start<=str.length()-len;start++)
        {
            int end = start+len-1;
            System.out.println(str.substring(start,end+1));
        }

        }
    }
}
