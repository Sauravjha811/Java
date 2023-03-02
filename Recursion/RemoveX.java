package Recursion_Java;
import java.util.*;
public class RemoveX {
    public static void main(String[] args) {
        String s = "xaxb";
        String r = remove(s);
        //Object Sysrem;
        System.out.println(r);
    }
    private static String remove(String s)
    {
        if(s.length()==0)
        {
            return "";
        }
        //String smallOutput = remove(s.substring(1));
        if(s.charAt(0)=='x')
        {
           return remove(s.substring(1));
        }
        return s.charAt(0)+remove(s.substring(1));
    }
}
