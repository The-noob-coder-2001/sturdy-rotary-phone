// PROGRAM TO COUNT FREQUENCY OF DIGITS IN AN INTEGER
import java.util.Scanner;
public class findOccuringDigit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
       countFreq(num);

    }
    static void countFreq(int num)
    {
        int rem=0, count=0, n=0;
        while(num>0)
        {
            rem = num%10;
            if(n==rem)
            {
                count++;
                
            }
            n=rem;
            num/=10;
            System.out.println(+rem+" is repeated : "+count+" times");

        }
       
    }
}