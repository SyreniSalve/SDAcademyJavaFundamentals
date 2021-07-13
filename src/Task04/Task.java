package Task04;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double amount = scanner.nextDouble();
        int numberOfInstallments = scanner.nextInt();

        if(amount < 100.0 || amount >10000.0){
            amount = 5000;
        }
        if(numberOfInstallments < 6 || numberOfInstallments > 48){
            numberOfInstallments = 36;
        }
        double loanInterest;
        if(numberOfInstallments <= 12){
            loanInterest = 0.025;
        } else if(numberOfInstallments <= 24){
            loanInterest = 0.05;
        } else {
            loanInterest = 0.1;
        }
        System.out.println((amount * loanInterest + amount)/ numberOfInstallments);
    }
}
