package two_d_Arrays;
import java.util.Scanner;
public class rowWiseSum {
    public static void main(String[] args) {
        int input[][] = takeInput();
        printRowWise(input);
    }
   
    private static void printRowWise(int [][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int rowSum=0;
            for(int j=0;j<arr[0].length;j++)
            {
              rowSum+=arr[i][j];
            }
            System.out.print(rowSum+" ");
        }
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
