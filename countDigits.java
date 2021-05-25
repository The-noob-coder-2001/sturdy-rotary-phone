import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("The number of digits in the entered number : "+num+" is : "+count(num));
    }
    static int count(int n)
    {
        int rem, count=0;
        while (n>0) {
            rem = n%10;
            count++;
            n=n/10;
        }
        return count;
    }
}
