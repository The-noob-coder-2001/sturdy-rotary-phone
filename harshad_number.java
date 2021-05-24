// 48 = 4 ,8, 4+8=12, 48%12==0, 
import java.util.Scanner;
public class harshad_number {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter a number to check for harshad number");
       int n = sc.nextInt();
        if(isHarshadNumber(n))
        {
            System.out.println("The number entered is a Harshad number");
        }
        else{
            System.out.println("The number is not a Harshad number");
        }
   }
   static boolean isHarshadNumber(int n)
   {
       int rem;
       int sum=0;
       int temp=n;
       while(n!=0)
       {
           rem=n%10;
           sum = sum + rem;
           n=n/10;
       }
      if(isDivisible(sum, temp))
      {
          return true;
      }
      else{
          return false;
      }

   }
   static boolean isDivisible(int sum, int number)
   {
       if(number%sum==0)
       {
           return true;
       }
       else{
           return false;
       }
   }
}
