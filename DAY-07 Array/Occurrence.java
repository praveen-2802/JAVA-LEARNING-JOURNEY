import java.util.Scanner;

public class Occurrence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=Arrayutility.inputarray();
        System.out.println("Enter Element:");
        int n=sc.nextInt();
        int occurrence=0;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==n)
            {
                occurrence++;
            }
        }
        System.out.println("Occurrence of "+n+" is = "+occurrence);
    }
}

