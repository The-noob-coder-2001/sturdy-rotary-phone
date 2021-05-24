import java.util.Scanner;
public class sumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumofDigits, num;
        System.out.println("Enter the number: ");
        num = sc.nextInt();
        System.out.println("Number of digits in "+num+" are : "+noOfDigits(num));
        
    }
    //this methods iterates through the number and returns the number of digits
    static int noOfDigits(int num)
    {
        int sum=0, rem;
        while(num!=0)
        {
            rem = num % 10;
            sum = sum +rem;
            num=num/10;
        }
        return sum;
    }
}
