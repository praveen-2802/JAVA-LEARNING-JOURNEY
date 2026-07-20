import java.util.Scanner;

public class ReplaceNegativeWithZero
{
    public  static void main(String args[])
    {
        int[] arr= Arrayutility.inputarray();
        System.out.println("=======New Array=========");
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]<0)
            {
                arr[i]=0;
            }
            System.out.print(arr[i]+" ");
        }
    }
}
