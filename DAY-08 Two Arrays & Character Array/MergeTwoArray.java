import java.util.Scanner;

public class MergeTwoArray
{
    public static void main(String args[])
    {
        int[] arr1=Arrayutility.inputarray();
        int[] arr2=Arrayutility.inputarray();
        int[] merge=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++)
        {
            merge[i] = arr1[i] ;
        }
        for (int i = 0; i < arr2.length; i++)
        {
            merge[arr1.length+i]=arr2[i] ;
        }
        System.out.println("The merged array is : ");
        Arrayutility.displayarray(merge);

    }
}
