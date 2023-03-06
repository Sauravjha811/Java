package Pattern_1;
import java.util.Scanner;
public class sumPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row=1;
        int sum=0;

        while(row<=n)
        {
            int currCol=1;
            sum+=row;
            while(currCol<=row)
            {
                System.out.print(currCol);
                if(currCol==row)
                {
                    System.out.print("=");
                }
                else
                {
                    System.out.print("+");
                }
                currCol++;
            }
            System.out.println(sum);
            row++;
        }
    }
}
