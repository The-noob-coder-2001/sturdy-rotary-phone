import java.util.Scanner;
public class sumFraction {
    public static void main(String[] args) {
        int res_denominator, res_numerator;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the following:");
        System.out.println("Enter the numerator 1");
        int num1 = sc.nextInt();
        System.out.println("Enter numerator 2");
        int num2 = sc.nextInt();
        System.out.println("Enter denominator 1");
        int deno1 = sc.nextInt();
        System.out.println("Enter denominator 2");
        int deno2 = sc.nextInt();
        // now all data has been inputed.
        // condition to check if the fractions entered has same denominator. So just add the numerator divide it with deno  minator.
        if(deno1 == deno2)
        {
            res_numerator = num1+num2;
            res_denominator = deno1;
            System.out.println("Sum of fractions = "+res_numerator/res_denominator);
        }
        else
        {
            res_numerator = ((num1*deno2)+(num2*deno1));
            res_denominator = deno1*deno2;
            System.out.println("Sum of fractions = "+res_numerator/gcd(res_numerator, res_denominator)+ "/"+res_denominator/gcd(res_numerator, res_denominator) );
        }
            sc.close();
    }
    //here gcd function is used to convert the resultant fraction into simpler form after all cancelling are done
    static int gcd(int a, int b)
    {
        while(b!=0)
        {
            if(a>b)
            {
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }

}
