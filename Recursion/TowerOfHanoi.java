package Recursion_Java;
import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println("Enter the no of disks in the tower:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // tower(n,'a','b','c');
       tower1(n,1,3);
    }
    private static void tower1(int disks, int fromRod, int toRod)
    {
        if(disks==1)
        {
            System.out.println(fromRod+" "+ toRod);
            return;
        }
       // int rem = 6 - fromRod - toRod;
       // tower1(disks - 1, fromRod, rem);
       // System.out.println(fromRod + " " + toRod);
        //tower1(disks - 1, rem, toRod);
       int rem = 1^2^3^fromRod^toRod;
        tower1(disks-1, fromRod, rem);
        System.out.println(fromRod+" "+ toRod);
       tower1(disks-1, rem,toRod);
    }
    private static void tower(int disks, char source, char helper, char destination)
    {
        if(disks==1)
        {
            System.out.println("Move disk 1 from Rod "+ source+" to rod "+ destination);
            return;
        }
        tower(disks-1, source, destination, helper);
        System.out.println("Move disk " +disks + "from rod "+ source+" to rod "+ destination);
        tower(disks-1, helper, source, destination);
    }
}
