package march12;

import java.util.Scanner;
import march10.Conditional;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int a = scanner.nextInt();
        System.out.println("Enter b value: ");
        int b = scanner.nextInt();
        System.out.println("Enter c value: ");
        int c = scanner.nextInt();
        int large = a;
        if (b > large) {
            large = b;
        }

        if (c > large) {
            large = c;
        }

        System.out.println(large);
    }
}
