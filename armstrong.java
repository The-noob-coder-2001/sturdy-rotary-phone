import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); int n = sc.nextInt();
        if(checkArmstrongNumber(n))
            System.out.println(n+" is an Armstrong number");
        else    
            System.out.println(n+" is not an Armstrong number");


    }
    // method takes user's input, returns true if armstrong number and false otherwise
    static boolean checkArmstrongNumber(int n)
    {
        boolean res;
        int sum=0, rem;
        int t=n;
        while(n!=0)
        {
            rem=n%10;
            sum = sum + (rem*rem*rem);
            n=n/10;
        }
        if(t==sum)
            return true;
        else
            return false;

    } 
}
