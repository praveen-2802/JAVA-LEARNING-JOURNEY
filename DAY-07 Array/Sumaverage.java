import java.util.Scanner;

public class Sumaverage
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Size:");
        int n= input.nextInt();
        System.out.println("Enter Element:");
        int[] arry= new int[n];
        for (int i = 0; i <n; i++)
        {
            arry[i]= input.nextInt();
        }
        int sum=0;
        for (int i = 0; i <n; i++)
        {
            sum=sum+arry[i];
        }
        System.out.println("Sum = "+sum);
        float average= sum/n;
        System.out.println("Average = "+average);
    }
}
