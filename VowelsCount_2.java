import java.util.Scanner;

public class VowelsCount_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] text = input.split(" ");

        int count = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i].equals("a") || text[i].equals("A")) {
                count++;
            } else if (text[i].equals("e") || text[i].equals("E")) {
                count++;
            } else if (text[i].equals("i") || text[i].equals("I")) {
                count++;
            } else if (text[i].equals("o") || text[i].equals("O")) {
                count++;
            } else if (text[i].equals("u") || text[i].equals("U")) {
                count++;
            } else if (text[i].equals("y") || text[i].equals("Y")) {
                count++;
            }
        }
        System.out.println(count);

    }
}
