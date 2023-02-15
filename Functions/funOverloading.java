package Functions_Java;

public class funOverloading {
    public static void main(String[] args) {
        int a = 12;
        int b = 23;
        double a1 = 23.43;
        double b2 = 78.98;
        System.out.println(sum(a));
        System.out.println(sum(a,b));
        System.out.println(sum(a1,b2));
    }
    private static int sum(int a)
    {
        return a+1;
    }
    private static int sum(int a, int b)
    {
        return a+b;
    }
    private static double sum(double a, double b)
    {
        return a+b;
    }
}
