// 6 - 1 2 3 1+2+3 = 6
import java.util.Scanner;
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to check that is it a perfect number or not!");
        int n = sc.nextInt();
        if(isPerfectNumber(n))
        {
            System.out.println("Yes, this number is a perfect number!");
        }
        else{
            System.out.println("No, this is not a perfect number");
        }

    }
    static boolean isPerfectNumber(int n)
    {
        int sum=0, i=1;
        while(i<n)
        {
            if(n%i==0) 
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum==n)
        {
            return true;
        }
        else{
            return false;
        }

    }
}
