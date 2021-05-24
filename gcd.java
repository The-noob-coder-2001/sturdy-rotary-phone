import java.util.Scanner;
public class gcd
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers to find the hcf");
        int a, b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("HCF of 2 numbers entered: "+a+" and "+b+" is :"+findHCF(a, b));
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