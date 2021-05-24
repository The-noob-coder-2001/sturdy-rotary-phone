import java.util.Scanner;
public class replaceAllZerosWithOnes {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = sc.nextInt();
       System.out.println("new number: "+returnReplacedZeros(num));
   } 
   static int returnReplacedZeros(int num)
   {
       int rem=0;
        if(num==0)
            return 0;
        rem = num%10;
        if(rem==0)
        {
            rem = 1;
        }
    return recursive(num/10)*10 + rem; 
   }
   static int recursive(int n)
   {
       if(n==0)
            return 1;
       else
            return recursive(n);

   }
}
