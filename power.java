import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number and its exponent value");
        int base = sc.nextInt();
        double exponent = sc.nextDouble();
        System.out.println("Result, number with "+base+" and power = "+exponent+" is :"+displayPower(base, exponent));
        sc.close();
    }
    // method that takes the base and exponent values as input, returns the result as base^exponent
    static double displayPower(int base, double exp)
    {
        int result=1;
        for(int i=1;i<=exp;i++)
        {
            result=result*base;
        }
        return result;
    }
}
