package Task23;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        boolean sameSign;
        sameSign = firstNumber < 0 && secondNumber < 0 || firstNumber > 0 && secondNumber > 0;

        System.out.println(sameSign);
    }
}
