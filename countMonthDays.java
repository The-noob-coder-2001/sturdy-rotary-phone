/**
 * program to find the number of days in a month of a specific year
 */
import java.util.Scanner;
public class countMonthDays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month:");
        String month = sc.nextLine();
        System.out.println("Enter the year:");
        int year = sc.nextInt();
        System.out.println("Total days in this month : "+findNumberOfDays(month, year));
    }
    static int findNumberOfDays(String m, int year)
    {
         if(m=="February")
        {
            if(isLeapYear(year))
            {
                return 29;
            }
            else
                return 28;
        }
        
       
        else if(m=="January"||m=="March"||m=="May"||m=="July"||m=="August"||m=="October"||m=="December")
            {
                return 31;
            }
            
        else
            return 30;

    
    }
    static boolean isLeapYear(int year)
    {
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        {
            return true;
        }
        else{
            return false;
        }
    }
    // static int isFeb(String m) // this method returns number of days in February when its leap year or when its not.
    // {
    
    //         if(m=="February")
    //         {
    //              System.out.println("This is a leap year");
    //              return 29;
    //         }
    //         return 29;
           
    //     }
}