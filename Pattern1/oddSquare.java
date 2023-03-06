package Pattern_1;
import java.util.Scanner;
public class oddSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row<=n)
        {
            int valueToprint = 2*row-1;
            int currCol=n;

            while(currCol>=1)
            {
            System.out.print(valueToprint);
            valueToprint+=2;
            int maxVal = (2*n)-1;
            if(valueToprint>maxVal)
            {
                valueToprint=1;
            }
           // valueToprint+=2;
            currCol--;
        }
        System.out.println();
        row++;
        }
    }
}
