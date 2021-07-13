package Task15;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String result = text.replaceAll("\\p{Punct}", "").toLowerCase();
        String[] words = result.split("\\s+");

        Arrays.sort(words);
        List<String> arr = Arrays.asList(words);
        Set<String> printed = new HashSet<>();

        for(String s : arr){
            if(printed.add(s))
                System.out.println(s + " - " + Collections.frequency(arr, s));
        }
    }
}
