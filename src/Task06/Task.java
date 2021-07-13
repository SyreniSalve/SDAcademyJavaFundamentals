package Task06;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Job completed");
        } else {
            int n = 0;
            while (a <= b) {
                n = n + a;
                a++;
            }
            System.out.println(n);
        }
    }
}
