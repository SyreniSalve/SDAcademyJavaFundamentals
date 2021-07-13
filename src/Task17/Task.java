package Task17;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] expression = scanner.nextLine().toCharArray();

        int zero = 0;

        for (char bracket : expression){
            switch (bracket){
                case '(':
                    zero++;
                    break;
                case ')':
                    zero--;
                    break;
            }

            if(zero < 0){
                break;
            }
        }
        if(zero!=0){
            System.out.println("Incorrect pairing of brackets");
        }else{
            System.out.println("OK");
        }
    }
}
