import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to reverse : ");
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        System.out.println("Reversed string:");
        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(" "+ch[i]);
        }


    }
}
