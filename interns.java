/**
 *  There are n interns numbered from 1 to N. Each intern is assigned with an unique ID each day. Rules for 1<=N<=24
 * The ith intern has ID 5000*ion day 1 and for the rest of the days : 
 */
import java.util.Scanner;
public class interns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of intern");
        int internID = sc.nextInt();
    }
    static void intern(int internID)
    {

    }
    static String returnNumber(int n)
    {
        if(n==1)
            return "First";
        else if(n==2)
            return "Second";
        else if(n==3)
            return "Third";
        else if(n==4)
            return "Fourth";
        else if(n==5)
            return "Fifth";
        else if(n==6)
            return "Sixth";
        else if(n==7)
            return "Seventh";
        else if(n==8)
            return "Eighth";
        else if(n==9)
            return "Ninth";
        return null;

    }
}
