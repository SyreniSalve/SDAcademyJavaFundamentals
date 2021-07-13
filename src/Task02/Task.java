package Task02;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tempInCelsius = scanner.nextFloat();
        float tempInFarhenheit = tempInCelsius * 1.8F + 32.0F;

        System.out.println(tempInFarhenheit);
    }
}
