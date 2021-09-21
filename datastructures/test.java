import java.lang.Math;

public class test {
    public static void main(String[] args) {
       int arr[] = {1,0,2,4,5};
       int numFromArray = arrayToInt(arr);
       System.out.println(numFromArray);
       
    }
    static int arrayToInt(int[] arr)
    {
        StringBuilder s = new StringBuilder(); 

        for (int i : arr)
        {
            s.append(i); //add all the ints to a string
        }

        return Integer.parseInt(s.toString()); //parse integer out of the string
    }
}
