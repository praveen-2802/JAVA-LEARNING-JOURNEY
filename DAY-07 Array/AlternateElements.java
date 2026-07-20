import java.util.Scanner;

public class AlternateElements
{
    public static void main(String args[])
    {
        int[] arr = Arrayutility.inputarray();
        //Arrayutility.displayarray(arr);
        System.out.println("Alternate Are:");
        for (int i = 0; i < arr.length; i+=2)
        {
            System.out.println(arr[i]);
        }
    }
}
