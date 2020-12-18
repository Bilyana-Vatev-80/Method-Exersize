import java.util.Scanner;

public class SmallestOfThree_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        printSmallestOfThreeNumbers(first, second, third);

    }

    private static void printSmallestOfThreeNumbers(int a, int b, int c) {
        int smallest = a;
        if (b < a) {
            smallest = b;
        }
        if (c < b) {
            smallest = c;
        }
        System.out.println(smallest);
    }
}
