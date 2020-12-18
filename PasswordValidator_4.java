import java.util.Scanner;

public class PasswordValidator_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean check1 = checkBetween6To10Characters(password);
        boolean check2 = checkLettersAndDigits(password);
        boolean check3 = checkLastTwoDigits(password);

        if (check1 && check2 && check3) {
            System.out.println("Password is valid");
        }

    }

    static boolean checkBetween6To10Characters(String password) {

        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
    }

    static boolean checkLettersAndDigits(String password) {
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

    static boolean checkLastTwoDigits(String password) {
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
