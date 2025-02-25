import java.util.Scanner;

public class primeRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();

        if (one > two || three > four) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}