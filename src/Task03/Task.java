package Task03;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        if(income <= 85528.00) {
            double upToTax = income * 0.18 - 556.02;

            if(upToTax < 0){
                upToTax = 0;
            }
            System.out.println(upToTax);

        } else {
            System.out.println((income - 85528.00) * 0.32 + 14839.02);
        }
    }
}
