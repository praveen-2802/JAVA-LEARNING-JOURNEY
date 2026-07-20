import java.util.Scanner;

public class MoveZeroEnd
{
    public static void main(String args[])
    {
        int[] arr=Arrayutility.inputarray();
        int pos=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[pos] = arr[i];
                pos++;
            }
        }
        while (pos < arr.length)
        {
            arr[pos] = 0;
            pos++;
        }
        Arrayutility.displayarray(arr);
    }
}
