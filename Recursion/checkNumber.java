package Recursion_Java;

public class checkNumber {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8};
        System.out.println(isPresent(a,0,87));
    }
    private static boolean isPresent(int[] a,int startIndex,int num)
    {
        if(startIndex == a.length)
        {
            return false;
        }
        if(a[startIndex] == num)
        {
            return true;
        }
        return isPresent(a,startIndex+1,num);
    }
}
