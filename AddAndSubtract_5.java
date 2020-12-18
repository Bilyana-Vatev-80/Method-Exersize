import java.util.Scanner;

public class AddAndSubtract_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = first + second;
        int allSum = sum - third;

        System.out.printf("%d", allSum);

    }
}
