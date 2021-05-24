/*We have a number suppose 1234.
Now we need to find the factorial of each of the digits from the number.
Now, we need to sum all the factorial's results and match the result with the digit entered by the user*/
import java.util.Scanner;
public class strong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        if(findStrongNumber(num))
        {
            System.out.println("The number "+num+" is a Strong number");
        }
        else
        {
            System.out.println("The number "+num+" is not a Strong number");
        }
        sc.close();
    }
    static boolean findStrongNumber(int n)
    {
        int rem=0, sum=0, temp=n;
        //logic for finding each digit.
        while(n!=0)
        {
            rem=n%10; // here the remainder is the required digit for finding factorial.
            sum = sum + fact(rem);
            // System.out.println("factorial: "+fact(rem));
            n=n/10;
        }
        // System.out.println("sum ="+sum);
        if(sum==temp)
        {
            return true;
        }
        else
            return false;
        
    }
    static int fact(int n)
    {
        int f=1;
        while(n>0)
        {
            
            f*=n--; //logic for factorization.
        }
        return f;
    }
}
