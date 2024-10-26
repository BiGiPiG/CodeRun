package CodeRun.Number_of_words_in_text;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        String word;
        int count = 0;
        while (scan.hasNext()) {
            word = scan.next();
            word = word.replace(".,;:", "");;
            if (!set.contains(word)) {
                set.add(word);
                count++;
            }
        }
        System.out.println(count);
    }
}