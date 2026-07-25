import java.util.Scanner;

public class FrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Characters: ");
        char[] ch = new char[n];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);
        }
        System.out.print("Enter Character To Search: ");
        char search =sc.next().charAt(0);
        int frequency = 0;
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] == search) {
                frequency++;
            }
        }
        System.out.println("Frequency of "+search+" ="+frequency);
    }
}