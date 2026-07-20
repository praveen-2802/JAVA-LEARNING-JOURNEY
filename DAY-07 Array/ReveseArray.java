import java.util.Scanner;

public class ReveseArray
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size:");
        int n = input.nextInt();
        System.out.print("Enter Element:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Reverse Array ");
        for (int i = n-1; i >=0; i--)
        {
            //int index =n-1;
            System.out.println(arr[i]);

        }
    }
}
