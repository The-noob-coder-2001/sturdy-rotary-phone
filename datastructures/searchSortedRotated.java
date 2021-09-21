public class searchSortedRotated {
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
    public static void main(String[] args) {
        int arr[] = {1,3,6,4,5,2};
        int n = arr.length;
        //we need to sort:
    }
    static int[] returnSorted(int arr[], int n)
    {
        
    }
}
