import java.util.Scanner;

public class FrequencyOfElement
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
        System.out.print("Enter the Integer:");
        int x= input.nextInt();
        int freq=0;
        for (int i = 0; i < n; i++) {
            if (x==arr[i])
            {
                freq++;
            }
        }
        System.out.println("Frequency of "+x+" = "+freq);
    }
}
