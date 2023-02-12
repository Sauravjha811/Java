package String_Java;
import java.util.Scanner;
public class countWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        System.out.println(count(str));
    }
    private static int count(String str)
    {
        if(str.length()==0)
        return 0;
        int spaces = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                ++spaces;
            }
        }
        return spaces+1;
    }
}
