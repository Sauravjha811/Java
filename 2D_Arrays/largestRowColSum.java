package two_d_Arrays;
import java.util.Scanner;
public class largestRowColSum {
    public static void main(String[] args) {
        int input[][] = takeInput();
        largestSum(input);
    }
    private static void largestSum(int [][]arr)
    {
        int maxSum=Integer.MIN_VALUE;
        int index = -1;
        boolean isRow=true;
        // first traverse through the rowWise.
        for(int i=0;i<arr.length;i++)
        {
            int rowSum=0;
            for(int j=0;j<arr[0].length;j++)
            {
              rowSum+=arr[i][j];
            }
            if(rowSum>maxSum)
            {
                maxSum=rowSum;
                index = i;
            }
        }
        // After, traverse through the colWise.
        for(int j=0;j<arr[0].length;j++)
        {
            int colSum=0;
            for( int i=0;i<arr.length;i++)
            {
              colSum+=arr[i][j];
            }
            if(colSum>maxSum)
            {
                isRow=false;
                maxSum=colSum;
                index=j;
            }
        }
        if(isRow)
        {
            System.out.print("Row ");
        }
        else
        {
            System.out.print("Column ");
        }
        System.out.print(index+" "+maxSum);
    }
    private static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];
        // these nested loops taking the input from the user.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at " + i + " row " + j + " column");
                arr[i][j] = sc.nextInt();
            }
        }
       return arr;
    }
}
