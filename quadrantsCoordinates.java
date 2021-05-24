import java.util.Scanner;
public class quadrantsCoordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates : ");
        int x1;
        int y1;
        System.out.println("Enter the x-coordinate : ");
        x1 = sc.nextInt();
        System.out.println("Enter the y-cordinate: ");
        y1 = sc.nextInt(); 
        checkCoordinates(x1, y1);
    }
    static void checkCoordinates(int x1, int y1)
    {
        if(x1<0 && y1>0)
        {
            System.out.println("Quandrant : II");
        }
        else if(x1<0 && y1<0)
        {
            System.out.println("Quandrant : III");
        }
        else if(x1>0 && y1<0)
        {
            System.out.println("Quadrant : IV");
        }
        else
        {
            System.out.println("Quandrant : I");
        }
    }
}
