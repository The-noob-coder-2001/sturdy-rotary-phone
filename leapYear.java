import java.util.Scanner;
public class leapYear
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Please enter the year you want to check that it is a leap year or not! \n");
        year = sc.nextInt();
        if(displayLeapYearOrNot(year))
        {
            System.out.println(year+" is a Leap year");
        }
        else
        {
            System.err.println(year+" is not a leap year!");
        }
        sc.close();
    }
    static boolean displayLeapYearOrNot(int year)
    {
        if(year%4==0 && year%100!=0 || year%400==0)
        {
           return true;
        }
        else 
        {
             return false;
        }
        
    }
}
