package Task11;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean noPrimeNum = false;
        if(number <= 1) {
            System.out.println("I am interrupting work");
            return;
        }
        for(int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                noPrimeNum = true;
                break;
            }
        } if (!noPrimeNum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
