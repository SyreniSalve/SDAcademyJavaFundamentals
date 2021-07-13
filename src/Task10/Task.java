package Task10;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int i;
        for(i = 1; i <= num; i ++){
            if(i % num == 0){
                System.out.println(i);
            }
        }
    }
}
