package Functions_Java;

public class fahToCelsiusTable {
    public static void main(String[] args) {
        int startFah=0;
        int endFah=100;
        int width=20;
        printTable(startFah,endFah,width);
    }
    private static void printTable(int start, int end, int width)
    {
       while(start<=end)
        {
            int cel = ((start-32)*5)/9;
            System.out.println(start+" "+cel);
            start+=width;
        }
    }
}
