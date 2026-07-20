import java.util.Scanner;

public class ProductOfElements
{
    public static void main(String args[])
    {
        int[] arr = Arrayutility.inputarray();
        System.out.println("Product of elements is:");
        int product = 1;
        for (int i = 0; i < arr.length; i++)
        {
             product= product*arr[i];
        }
        System.out.println(product);
    }
}
