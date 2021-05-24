import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check it is prime or not!");
        number = sc.nextInt();
        if(checkPrime(number))
        {
            System.out.println(number+" is a prime number");

        }
        else
        {
            System.err.println(number+" is not a prime number");
        }
        sc.close();
    }
    
    static boolean checkPrime(int n)
    {
        int count = 0;
        for(int i=1; i<=n; i++)
        {
            if(n % i == 0) //dividing with each number while iterating till the entered number.
            {
                count++;
            }
        }
        if(count == 2) // that means it has only 2 factors. So, a prime number!
            return true;
        else
            return false;
    }
}
