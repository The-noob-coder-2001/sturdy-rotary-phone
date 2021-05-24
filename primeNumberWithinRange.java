import java.util.Scanner;
public class primeNumberWithinRange {
    public static void main(String[] args) {
        int start, end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to check it is prime or not!");
        start=sc.nextInt();
        end=sc.nextInt();
        System.out.println("The prime numbers between "+start+" and "+end+" are:");
        for(int i=start;i<=end;i++)
        {
            if(checkPrime(i))
                System.out.print(i+" ");
            // else
            //     System.out.println(i+" is not a prime number"); 
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
