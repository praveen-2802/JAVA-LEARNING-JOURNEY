import java.util.Scanner;

public class ATM
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====== ATM =======");
        System.out.println("1.Check Balance:");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        System.out.print("What you want ot do:");
        int num = input.nextInt();
        int initailamount = 100000;
        switch (num)
        {
            case 1:
                System.out.println("Your current balance is:"+initailamount);
                break;
            case 2:
                System.out.print("Enter the money you want ot deposit:");
                int deposit= input.nextInt();
                int current1 = initailamount+deposit;
                System.out.println("so now the updated balance is:"+(initailamount+deposit));
                break;
            case 3:
                System.out.println("Enter the amount you wanna withdraw:");
                int withdraw = input.nextInt();
                int current = initailamount-withdraw;
                if (withdraw<initailamount)
                {
                    System.out.println("The amount withdrawal completed");
                    System.out.println("Current balance;"+current);
                } else
                {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 4:
                System.out.println("Thanks for using ATM");
                break;
        }
    }
}