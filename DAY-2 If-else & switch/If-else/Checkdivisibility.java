import java.util.Scanner;

public class Checkdivisibility
 {
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the num:");
         int x1 = input.nextInt();
         if (x1%5 ==0 && x1%11==0)
         {
             System.out.println(x1+" is Divisible by Both");
         } else if (x1%5 ==0 && x1%11 !=0)
         {
             System.out.println("Num is Divisible by 5 but not 11");
         } else if (x1%11 ==0 && x1%5 !=0)
         {
             System.out.println("Num is Divisible by 11 but not 5");
         } else
         {
             System.out.println("Not Divisible by Both");
         }
     }
}

