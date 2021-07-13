package Task22;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean nearHundred;

        nearHundred = number >= 100 - 10 && number <= 100 + 10;
        System.out.println(nearHundred);
    }
}
