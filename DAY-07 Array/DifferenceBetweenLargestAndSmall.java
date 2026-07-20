import java.util.Scanner;

public class DifferenceBetweenLargestAndSmall
{
    public static void main(String args[])
    {
        int[] arr=Arrayutility.inputarray();
        int largest=arr[0];
        int smallest=arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        int diff=largest-smallest;
        System.out.println("Largest = "+largest);
        System.out.println("Smallest = "+smallest);
        System.out.println("Difference = "+diff);
    }
}
