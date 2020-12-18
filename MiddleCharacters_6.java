import java.util.Scanner;

public class MiddleCharacters_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        middleCharacters(input);
    }

    private static void middleCharacters(String input) {
        int count = input.length();
        if (count % 2 == 0) {
            for (int i = input.length() / 2 - 1; i < input.length() / 2 + 1; i++) {
                char symbol = input.charAt(i);
                System.out.print(symbol);
            }
        } else {
            char symbol = input.charAt(input.length() / 2);
            System.out.print(symbol);
        }
    }
}
