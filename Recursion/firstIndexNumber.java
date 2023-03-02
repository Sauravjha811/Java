package Recursion_Java;

public class firstIndexNumber {
    public static void main(String[] args) {
        int arr[] = {12,45,98,98,87,84,46,74};
        System.out.println(firstIndex(arr,12,0));
    }
    private static int firstIndex(int input[], int x, int startIndex)
	{
		if(startIndex == input.length)
		{
			return -1;
		}
		if(input[startIndex]==x)
		{
			return startIndex;
		}
		return firstIndex(input, x, startIndex+1);
	}
}
