import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position after which you want to rotate");
        int pos = sc.nextInt();
        arrayRotation a = new arrayRotation();
        a.rotateLeft(arr, arr.length, pos);
        a.rotateRight(arr, arr.length, pos);
    }

    void rotateLeft(int arr[], int n, int pos)
    {
        int temp;
        for(int i=0;i<pos;i++)
        {
            temp = arr[0];
            for(int j=0;j<n-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        System.out.println("After Left Rotation: "+Arrays.toString(arr));

    }
    void rotateRight(int arr[], int n, int pos)
    {
        int temp;
        for(int i=0;i<=n;i++)
        {
            temp = arr[n-1];
            for(int j=n-1;j>0;j--)//backwards
            {
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println("After right Rotation: "+Arrays.toString(arr));
    }

}