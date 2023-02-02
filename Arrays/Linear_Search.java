package Arrays_Problem_Java;

public class Linear_Search extends Functions_Array {
    public static void main(String[] args) {
        int arr[] = {12,23,45,65,67};
        int x = 45;
        System.out.println(linearSearch(arr,x));
    }
    public static int linearSearch(int arr[], int x) {
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==x)
      {
        return i;
      }
    }
    return -1;
    }
}
