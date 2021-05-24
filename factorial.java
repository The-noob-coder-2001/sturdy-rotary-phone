import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
       System.out.println("Factorial of "+num+" is :"+factorial(num));

    }
    static int factorial(int n)
    {
        int f=1;
        while(n!=0)
        {
            f*=n--;
        }
        return f;
    }
}
