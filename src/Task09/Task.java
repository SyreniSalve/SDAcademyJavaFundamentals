package Task09;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        do {
            number = scanner.nextInt();
            if(number > min){
                min = number;
            } else if (number < max){
                max = number;
            }
        } while(number != 0);
        double average = (min + max) / 2.0;
        System.out.println(min + max);
        System.out.println(average);
    }
}
