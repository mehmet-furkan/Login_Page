import java.util.Scanner;

public class Fibonacci {
    public static int fibIteratif(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            int a = 0;
            int b = 1;

            for (int i = 2; i <= n; i++) {
                int temp = a + b;
                a = b;
                b = temp;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sonuc = fibIteratif(number);
        System.out.println("Sonuc: " + sonuc);
    }
}