import java.util.Scanner;
public class gcd_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to find their GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD of 2 numbers : "+findGCD(a, b));

    }
    static int findGCD(int a, int b)
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
