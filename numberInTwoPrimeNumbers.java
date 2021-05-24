/**
 * Algorithm:
 * Accepts the number from user
 * iterate i from 1 to the number.
 * check that i is prime
 *  check(i is prime)
 *  {
 *      if true, check(number -i is prime)
 *          {
 *              if true, return (number-i) and i
 *              else
 *                  continue the loop
 *          }
 *  }
 */
import java.util.Scanner;
public class numberInTwoPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        for(int i=1;i<=num/2;i++)
        {
            if(isPrime(i))
            {
                if(isPrime(num-i))
                {
                    System.out.println("Sum of "+(num-i)+" and "+i+" = "+num);
                }
                else if(!isPrime(num-i))
                {
                    System.out.println("Cannot be represented as sum of Prime numbers");
                }
                 
            }
           
        }
        
            
        

    }
    static boolean isPrime(int a)
    {
       int count = 0;
       for(int i =1;i<=a; i++)
       {
           if(a%i==0)
           {
               count++;
           }
       }
       if(count==2)
        return true; // only has 2 factors
       else
        return false;
    }
}
