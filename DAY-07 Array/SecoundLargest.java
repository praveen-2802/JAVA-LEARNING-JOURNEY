import java.util.Scanner;

public class SecoundLargest
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
        int max= arr[0];
        int secound=arr[0];
        for (int i = 0; i < n; i++)
        {
            if (arr[i]>max)
            {
                secound=max;
                max=arr[i];
            } else if (secound<arr[i])
            {
                secound=arr[i];
            }

        }
        System.out.println("Second largest "+ secound);
    }
}
