import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean check1 = printBetween6And10(password);
        boolean check2 = printOnlyOfLettersAndDigits(password);
        boolean check3 = printLastTwoDigits(password);

        if (check1 = check2 = check3) {
            System.out.println("Password is valid");
        }
    }

    public static boolean printBetween6And10(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    public static boolean printOnlyOfLettersAndDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
                System.out.println("Password must consist only of letters and digits");
                count++;
                break;
            }
        }
        return count <= 0;

    }

    public static boolean printLastTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }

}
