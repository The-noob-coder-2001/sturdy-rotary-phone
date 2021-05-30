import java.util.Scanner;
public class no_of_bowls_HRC
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bowels:");
        int N = sc.nextInt();
        System.out.println("Enter the number of marbles in those bowels:");
        int marbles[]=new int[N];
        // enter all marbles into the bowels
        for(int i=0;i<(N);i++)
        {
            marbles[i] = sc.nextInt();
        }
        System.out.println("Total number of bowls : "+N);

        System.out.println("Marbles inside it : ");
        // print all marbles inside the bowels
        for(int i=0;i<(N);i++)
        {
            System.out.println(" "+marbles[i]);
        }
        System.out.println("bowl modified at "+returnMarbleCount(marbles, N)+" position");
    }
    public static int returnMarbleCount(int marbles_in_bowl[], int bowls)
    {
        if(marbles_in_bowl[bowls-1]!=9)
        {
            marbles_in_bowl[bowls-1]+=1; // if there are 5 elements so last element is arr[5]!=9, then arr[5]+=1 and return 5;
            return bowls;
        }
        else if(marbles_in_bowl[bowls-1]==9){
            for(int i=bowls-2;i>=0;i--)
            {
                if(marbles_in_bowl[i]!=9) // here it starts from last end of the array.
                {
                    marbles_in_bowl[i]+=1; // second last element is !=9, then arr[second_last_element]+=1; 
                    marbles_in_bowl[i+1]=0; // arr[second_last_element+1]=0;
                    return i+1; // return i+1
                }
            }
        }
        return 0;
    
    }
}