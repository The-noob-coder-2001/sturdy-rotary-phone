import java.util.Scanner;
public class printAllPrimeNumbers {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which number to find the prime numbers :");
        int n = sc.nextInt();
        System.out.println("Number of prime numbers from 1 to "+n+" : "+findPrime(n));

    }
    static int findPrime(int n)
    {
        int numberOfPrimes=0;
        for(int i=1;i<=n;i++)
        {
            if(isPrime(i))
            {
                numberOfPrimes++;
            }
        }
        return numberOfPrimes;
    }
    static boolean isPrime(int n)
    {
        int i=1;
        int count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
            
        }
        if(count==2)
        {
            return true;
        }
        else{return false;}
    }
}
