import java.util.Scanner;

public class LowerToUpper
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of The Array: ");
        int n = sc.nextInt();
        System.out.print("Enter Characters: ");
        char[] ch = new char[n];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = sc.next().charAt(0);

        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='a' && ch[i]<='z') {
                ch[i] = (char)(ch[i]-32);
            }
        }
        for (int j = 0; j < ch.length; j++) {
            System.out.print(ch[j]+" ");
        }
    }
}
