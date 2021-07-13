package Task08;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        while( n != 0){
            i = i + n;
            n = scanner.nextInt();
        }
        System.out.println(i);
    }
}
