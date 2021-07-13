package Task21;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float speedInMpH = scanner.nextFloat();
        float speedInKmH = 1.6f * speedInMpH;

        System.out.println(speedInKmH);
    }
}
