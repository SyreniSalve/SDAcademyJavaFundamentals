package Task24;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfJam;
        do {
            amountOfJam = scanner.nextInt();
        } while (amountOfJam <= 0);

        int amountOf7KgJars = amountOfJam/7;
        int amountOf1KgJars = amountOfJam % 7;
        boolean result= amountOf7KgJars + amountOf1KgJars <= 6;
        System.out.println(result);
    }
}
