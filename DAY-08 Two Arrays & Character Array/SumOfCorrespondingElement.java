import java.util.Scanner;

public class SumOfCorrespondingElement
{
    public static void main(String args[])
    {
        int[] arr1= Arrayutility.inputarray();
        int[] arr2= Arrayutility2.inputarray2();
        for (int i = 0; i < arr1.length; i++)
        {
            System.out.println((arr1[i]+arr2[i]));
        }
    }
}
