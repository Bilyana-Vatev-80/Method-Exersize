import java.util.Scanner;

public class CharactersInRange_1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);

        if (first < second) {
            printCharactersInRange(first, second);
        } else {
            printCharactersInRange(second, first);
        }

    }

    private static void printCharactersInRange(char first, char second) {
        for (char i = ++first; i < second; i++) {
            System.out.printf("%c ", i);
        }
    }
}
