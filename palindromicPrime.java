import java.util.Scanner;

public class palindromicPrime {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int test_cases = sc.nextInt();
        for(int i=0;i<test_cases;i++)
        {
            int l=sc.nextInt(); 
            int r=sc.nextInt();
            int count = 0;
            for(int j=l;j<=r;j++)
            {
                if(checkPallindrome(j) && checkPrime(j))
                {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
    public static boolean checkPallindrome(int num)
    {
        int temp = num;
        int rem = 0, sum=0;
        while(num>0)
        {
            rem = num%10;
            sum = (sum*10)+rem;
            num = num/10;
        }
        if(temp==sum)
        {
            return true;
        }
        return false;
    }
    public static boolean checkPrime(int num)
    {
        int count = 0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }

        }
        if(count==2)
        {
            return true;
        }
        return false;
    }
}
