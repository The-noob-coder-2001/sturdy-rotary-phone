public class binarySearch { // time -complexity : O(nlgn)
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6}; // remember, binary search only works in finding an element from an already sorted array.  
        int key = 6;
        if(BinarySearch(key, arr, arr.length)>0){
            System.out.println("Array element searched, present at : "+BinarySearch(key, arr, arr.length)+" position");
        }
        else{
            System.out.println("Searched element not found");
        }
    }
    static int BinarySearch(int key, int arr[], int size)
    {
        int start=0;
        int end = size-1;
        int mid;
        while(start<=end)
        {
            mid = (start+end)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            else if(key>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }
}
