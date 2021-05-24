/**
 * Permutations in which n people can occupy r seats in a classroom:-
identifying the r number of seats that can be occupied by n number of people. Such a program is known as the possible permutations. 
Here, We need to write a code to find all the possible permutations in which n people can occupy r number of seats in a classroom/theater.
N students are looking to find r seats in a classroom. Some of the seats are already occupied and only a few can accommodate in the classroom. 
The available seats are assumed as r and n number of people are looking to accommodate within the room.

OR

Write code to find all possible permutations in which n people can occupy r seats in a theater
 */
import java.util.Scanner;
public class permutationsOccupy {

    static int factorial(int n)
    {
        int f=1;
        while(n>0)
        {
            f*=n--;
        }
        return f;
    }
    static int returnPermutations(int n, int r)
    {
        int permutations = 0;
        permutations = factorial(n)/ factorial(n-r);
        return permutations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r respectively");  
        System.out.println("enter the num of persons:");  
        int n=sc.nextInt();
        System.out.println("enter the number of seats available");
        int r = sc.nextInt();
        System.out.println("Number of permutations for "+n+" and "+r+" is: "+returnPermutations(n, r));    
    }
}
