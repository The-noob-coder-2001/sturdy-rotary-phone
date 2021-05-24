import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : ");
        int num = sc.nextInt();
        printFibonacci(num);

    }
    //method which takes input of nth term until which it finds the fibonacci numbers and prints them.
    static void printFibonacci(int num)
    {
        int pointa=0, pointb=1; //these are some references for calculation of the next elements in fibonacci series.
        int sum=0;
        System.out.println("The fibonacci numbers until the "+num+"th term are:");
        while(sum<=num)
        {
            sum=pointa+pointb;
            System.out.print(pointb+" ");
            pointa=pointb;
            pointb=sum;
        }
    }
}