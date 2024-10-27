import java.util.Scanner;
import java.util.HashMap;

public class Dictionary_of_synonyms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //ввод данных
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            String value = sc.next();
            map.put(key, value);
        }

        String word = sc.next();


        //является ли слово ключом
        if (map.containsKey(word)) {
            System.out.println(map.get(word));
        } else {
            for (var elem : map.keySet()) {
                if (map.get(elem).equals(word)) {
                    System.out.println(elem);
                }
            }
        }
    }
}