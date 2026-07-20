import java.util.Scanner;

public class CopyArray
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter size:");
        int n= input.nextInt();
        System.out.println("Enter Element:");
        int[] arr1=new int[n];
        for (int i = 0; i < n; i++)
        {
            arr1[i]= input.nextInt();
        }
        int[] aar2= new int[n];
        System.out.println("Copied array");
        for (int i = 0; i < n; i++)
        {
            aar2[i]=arr1[i];
            System.out.println(aar2[i]);
        }
    }
}
