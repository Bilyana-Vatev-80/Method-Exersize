import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumbers = Integer.parseInt(scanner.nextLine());
        int secondNumbers = Integer.parseInt(scanner.nextLine());
        int thirdNumbers = Integer.parseInt(scanner.nextLine());
        bigNumber(firstNumbers, secondNumbers, thirdNumbers);
    }

    private static void bigNumber(int firstNumbers, int secondNumbers, int thirdNumbers) {
        int smallestNumbers = 0;
        if (firstNumbers < secondNumbers) {
            smallestNumbers = firstNumbers;
        } else if (secondNumbers < thirdNumbers) {
            smallestNumbers = secondNumbers;
        } else {
            smallestNumbers = thirdNumbers;
        }
        System.out.println(smallestNumbers);
    }
}
