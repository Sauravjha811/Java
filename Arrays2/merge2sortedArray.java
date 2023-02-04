package Arrays2_java;

public class merge2sortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,4,6,};
        int arr2[] = {2,5,7,9};
        int ans[]=merge(arr1, arr2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
    private static int[] merge(int arr1[], int arr2[])
    {
       int ans[] = new int[arr1.length+arr2.length];
       int k=0,j=0,i=0;
       
       while(i<arr1.length && j<arr2.length)
       {
        if(arr1[i]<=arr2[j])
        {
          ans[k]=arr1[i];
          i++;
          k++;
        }
        else
        {
            ans[k]=arr2[j];
            j++;
            k++;
        }
       }
       while(i<arr1.length)
       {
        ans[k]=arr1[i];
        i++;k++;
       }
       while(j<arr2.length)
       {
        ans[k]=arr2[j];
        j++;k++;
       }
       return ans;
    }
}
