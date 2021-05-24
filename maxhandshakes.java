import java.util.Scanner;
public class maxhandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert an integer value n, representing the number of people");
        int num = sc.nextInt();
        System.out.println("Number of handshakes are : "+returnHandshakes(num));
    }
    static int returnHandshakes(int people)
    {
        return(people*(people-1)/2);
    }
}
