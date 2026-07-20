import java.util.Scanner;

public class SwaptheFirstAndLast
{
    public static void main(String args[])
    {
        int[] arr = Arrayutility.inputarray();
        //Arrayutility.displayarray(arr);
        int first = arr[0];
        int last = arr[arr.length-1];
            arr[0] = last;
            arr[arr.length-1] = first;
        Arrayutility.displayarray(arr);
    }
}
