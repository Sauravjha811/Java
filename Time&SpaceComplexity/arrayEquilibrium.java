package Time_Complexity_Java;

public class arrayEquilibrium {
    public static void main(String[] args) {
       // int arr[] = { 1,4,9,3,2};
       int arr[] = {2,3,10,-10,4,2,9};
        System.out.println(equilibriumIndex1(arr));
    }
    // optimized approach.
    private static int equilibriumIndex1(int arr[])
    {
        // calcualte sum of array.
        int sum=0;
        int sumLeft=0;
        for(int element:arr)
        {
            sum+=element;
        }
        for(int i=0;i<arr.length;i++)
        {
            sum-=arr[i];
        if(sum==sumLeft)
        {
            return i;
        }
        sumLeft+=arr[i];
    }
    return -1;
    }
     // noive approach...
    private static int equilibriumIndex(int arr[])
    {
		int i=0;
		while(i<arr.length)
		{
            // calculate the sum of left part of an array.
			int sumL=0;
			for(int j=0;j<i;j++)
			{
				sumL+=arr[j];
			}
            // calcualte the sum of right part of an array.
			int sumR=0;
			for(int j=i+1;j<arr.length;j++)
			{
				sumR+=arr[j];
			}
			if(sumL==sumR)
			{
			   break;
			}
			i++;
		}
		if(i==arr.length)
		{
			return -1;
		}
        return i;
    }
}
