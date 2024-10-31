package CodeRun.Word_occurrence_number;

import java.util.HashMap;
import java.io.*;

public class Word_occurrence_number {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.trim().split("\\s+");
            for (var word : parts) {
                if (!word.isEmpty()) {
                    int count = map.getOrDefault(word, 0);
                    System.out.print(count + " ");
                    map.put(word, count + 1);
                }
            }
        }
    }
}
