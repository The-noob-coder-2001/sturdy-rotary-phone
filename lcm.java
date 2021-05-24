//logic : use gcd method. lcm = num1 * num2 /gcd(num1, num2)
import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers to find the lcm:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("LCM of 2 numbers entered is : "+lcm(num1, num2));
    }
    static int lcm(int a, int b)
    {
         
        return ((a*b)/findHCF(a,b));
    }
    static int findHCF(int a , int b)
    {
        int temp;
        while(b>0)
        {
            temp = b;
            b = a%b;
            a= temp;
        }
        return a;

    }
}
