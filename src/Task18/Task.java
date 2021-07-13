package Task18;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().replaceAll("\\p{Punct}", " ");
        int n = scanner.nextInt();
        System.out.println(cypher(text, n));
    }
    public static StringBuffer cypher(String text, int n) {
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            char ch = ' ';
            if (text.charAt(i) != ' ') {
                ch = (char) (((int) text.charAt(i) + n - 97) % 26 + 97);
            }
            result.append(ch);
        }
        return result;
    }
}
