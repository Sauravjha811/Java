package Arrays_Problem_Java;

public class Return_ArraySum{
    public static void main(String[] args) {
        //int arr1[] = takeInput();
        int arr1[] ={1,2,3,4,5};
        System.out.println("Sum of the Array is: "+sum(arr1));
    }
    public static int sum(int[] arr) {
		//intialize a variable sum outside the loops,
        // stores the sum of all the elements.
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}
