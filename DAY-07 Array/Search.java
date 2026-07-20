import java.util.Scanner;

public class Search
{
    static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter size:");
        int n= input.nextInt();
        System.out.print("Enter element:");
        int[] arr= new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.print("Search:");
        int a= input.nextInt();
        boolean found=false;
        for (int i = 0; i < n; i++)
        {
            if (a == arr[i])
            {
                found=true;
                break;
            }
        }
        if (found==true)
        {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not Found");
        }
    }
}
