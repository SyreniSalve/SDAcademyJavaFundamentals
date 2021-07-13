package Task12;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 1; i <= 10; i++){
            int count = 0;

            for (int number : numbers){
                if (number == i){
                    count ++;
                }
            }
            System.out.println(i + " - "+ count);
        }
    }
}
