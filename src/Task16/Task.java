package Task16;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        StringBuffer buffer = new StringBuffer(text);
        System.out.println(buffer.reverse());
    }
}
