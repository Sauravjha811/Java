package Recursion_Java;

public class lastIndexNumber {
    public static void main(String[] args) {
        int arr[] = {12,45,98,98,87,84,46,74};
        System.out.println(lastIndex(arr,98,0));
    }
    private static int lastIndex(int input[], int x, int startIndex)
	{
		if(startIndex == input.length)
		{
			return -1;
		}
        int k = lastIndex(input, x, startIndex+1);
		if(k!=-1)
		{
			return k;
		}
		else
        {
            if(input[startIndex]==x)
            return startIndex;
            else
            return -1;
        }

	}
}