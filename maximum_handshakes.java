/**
 * Logic to solve this problem:
 * use formula n*(n-1)/2 to find the result.
 */
import java.util.Scanner;
public class maximum_handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people involved in handshake");
        int people = sc.nextInt();
        System.out.println("Number of handshakes done by "+people+" people is: "+findNumberOfHandshakes(people));

    }
    static int findNumberOfHandshakes(int n)
    {
        int result = 0;
        result = n*(n-1)/2;
        return result;
    }
}
