import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();
        System.out.println("The reverse of the entered number "+number+" is :"+reverseNumber(number));
    }
    // method to reverse the number which returns the reversed number of the entered ome
    static int reverseNumber(int n)
    {
        int rem=0, reverse=0;
        while(n!=0)
        {
           rem=n%10;
           reverse = reverse*10+rem;
           n=n/10;
        }
        return reverse;
    }
}
