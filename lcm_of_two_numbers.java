/**LCM = num1*num2/gcd(num1, num2) */
import java.util.*;
public class lcm_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2  numbers to find the LCM");
        int a = sc.nextInt(); int b = sc.nextInt();
        System.out.println("LCM of 2 numbers entered is : "+returnLCM(a, b));

    }
    static int returnLCM(int a, int b)
    {
        return (a*b)/returnGCD(a, b);
    }
    static int returnGCD(int a, int b)
    {
        while(b!=0)
        {
            if(a>b)
            {
                a=a-b;
            }
            else
            {
                b=b-a;
            }
        }
        return a;
    }
}
