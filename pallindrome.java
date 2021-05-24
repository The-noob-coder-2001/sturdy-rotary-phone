import java.util.Scanner;
public class pallindrome extends reverse 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= sc.nextInt();

        if(number==reverse.reverseNumber(number))
            System.out.println(number+" is a Pallindrome number");
        else
            System.out.println(number+" is not a Pallindrome number");


    }
}
