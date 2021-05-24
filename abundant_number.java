import java.util.Scanner;
public class abundant_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it's abundance!");
        int n = sc.nextInt();
        int abundant = findAbundant(n);
        System.out.println("The abundant for the entered digit is : "+abundant);
    }
    static int findAbundant(int n)
    {
        int i=1, sum=0, diff=0;
        while(i<n)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        diff = n-sum;
        return diff;

       
    }
}