package two_d_Arrays;
import java.util.*;
public class colSum {
    public static void main(String[] args) {
        int input[][] = takeInput();
        printColWise(input);
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
    private static void printColWise(int [][] arr)
    {
        for(int j=0;j<arr[0].length;j++)
        {
            int colSum=0;
            for( int i=0;i<arr.length;i++)
            {
              colSum+=arr[i][j];
            }
            System.out.print(colSum+" ");
        }
    }
}
