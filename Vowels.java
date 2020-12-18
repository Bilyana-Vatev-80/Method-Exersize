import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] word = input.split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("a") || word[i].equals("A")) {
                count++;
            } else if (word[i].equals("e") || word[i].equals("E")) {
                count++;
            } else if (word[i].equals("i") || word[i].equals("I")) {
                count++;
            } else if (word[i].equals("o") || word[i].equals("O")) {
                count++;
            } else if (word[i].equals("u") || word[i].equals("U")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
