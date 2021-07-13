package Task07;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;

        while(n < i){
            n = scanner.nextInt();
        }
        System.out.println(i);
        while (i + i  < n){
            i = i + i;
            System.out.println(i);
        }
    }
}
