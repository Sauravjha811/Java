package Recursion_Java;

public class removeDuplicate {
    public static void main(String[] args) {
        String s = "aabccba";
        System.out.println(removeDup(s));
    }
    private static String removeDup(String s){
        if(s.length()<=1)
        {
            return s;
        }
       // String smallOutput = removeDup(s.substring(1));
        //if(s.charAt(0)==smallOutput.charAt(0))
        //{
         //   return smallOutput;
        //}
        //else
        //{
          //  return s.charAt(0)+smallOutput;
        //}
        if(s.charAt(0)==s.charAt(1))
        {
            return removeDup(s.substring(1));
        }
        else
        {
            return s.charAt(0)+removeDup(s.substring(1));
        }
    }
}
