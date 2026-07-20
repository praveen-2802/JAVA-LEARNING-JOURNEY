import java.util.Scanner;

public class ReveseArrayExtra
{
    public static void main(String args[])
    {
        int[] arr=Arrayutility.inputarray();
        int[] revese=new int[arr.length];
        System.out.println("Reverse Array ");
        for (int i = 0; i < arr.length;i++)
        {
            revese[i]=arr[arr.length-1-i];
            System.out.println(revese[i]);
       }
    }
}
